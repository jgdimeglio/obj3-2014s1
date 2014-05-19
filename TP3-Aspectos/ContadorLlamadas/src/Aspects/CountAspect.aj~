package Aspects;

import java.util.HashMap;
import java.util.Map;

import Annotations.Monitored;

public aspect CountAspect pertarget(execution(@Monitored * *(..))){

	pointcut setter(Object target) : 
		execution(@Monitored * *(..)) && target(target);

	after(Object target) : setter(target) {
		String fieldName = thisJoinPoint.getSignature().getName();
		if (!map.containsKey(fieldName)) {
			map.put(fieldName, 1);
		} else {
			map.put(fieldName, ((map.get(fieldName) + 1)));
		}
	}

	// *************************************************************************************************

	private Map<String, Integer> map = new HashMap<String, Integer>();

	public int getCounterOf(String nameMethod){
		return map.get(nameMethod);
	}
}
