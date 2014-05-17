package aspects;

import interfaces.ObservableObject;
import interfaces.ObservableObjectSupport;
import interfaces.Validator;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import utils.Utils;
import annotations.Observable;
import exceptions.InvalidValueException;

public aspect ValidadorAspect {

	declare parents : @Observable * implements ObservableObjectSupport;

	pointcut fieldWrite(ObservableObjectSupport target, Object newValue) : 
	set(* *..*)
	&& args(newValue) 
	&& target(@Observable target)
	&& !withincode(*.new(..))
	&& within(@Observable *);

	void around(ObservableObjectSupport target, Object newValue) : fieldWrite(target, newValue) {
		String fieldName = thisJoinPoint.getSignature().getName();
		Object oldValue = Utils.getField(target, fieldName);


		if (oldValue != newValue) {
			target.fieldChanged(fieldName, oldValue, newValue);
			proceed(target, newValue);
		}
	}

	after(ObservableObjectSupport target) : initialization(* ..*.new(..) ) && target(target) {
		target.initialize();
	}

	// ***********************************************************
	// ** Added members
	// ***********************************************************

	private transient PropertyChangeSupport ObservableObject.changeSupport;

	public void ObservableObject.initialize() {
		this.changeSupport = new PropertyChangeSupport(this);
	}

	public void ObservableObject.addValidator(String propertyName,
		 final Validator<Object> aValidator) {
		this.changeSupport.addPropertyChangeListener(propertyName, new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				if(!aValidator.validate(evt.getNewValue())){
					throw new InvalidValueException();
				}
			}
			
		});
	}

	public void ObservableObject.fieldChanged(String fieldName,
			Object oldValue, Object newValue) {
		this.changeSupport.firePropertyChange(fieldName, oldValue, newValue);
	}
}
