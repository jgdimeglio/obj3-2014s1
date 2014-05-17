package interfaces;

public interface ObservableObjectSupport extends ObservableObject {

	public void initialize();
	
	public void fieldChanged(String fieldName, Object oldValue, Object newValue);
	
}
