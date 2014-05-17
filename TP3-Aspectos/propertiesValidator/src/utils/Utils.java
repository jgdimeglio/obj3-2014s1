package utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author phm
 */
public class Utils {

	public static <A extends Annotation> A getAnnotation(Object thiz, String fieldName,
			Class<A> annotationClass) {
		try {
			// TODO: it only works for non-inherited fields
			Field field = thiz.getClass().getDeclaredField(fieldName);
			return field.getAnnotation(annotationClass);
		} catch (IllegalArgumentException e) {
			throw new RuntimeException(
					"Error while reading current field value: "
							+ thiz.getClass() + "." + fieldName, e);
		} catch (SecurityException e) {
			throw new RuntimeException(
					"Error while reading current field value: "
							+ thiz.getClass() + "." + fieldName, e);
		} catch (NoSuchFieldException e) {
			throw new RuntimeException(
					"Error while reading current field value: "
							+ thiz.getClass() + "." + fieldName, e);
		}
	}

	public static Object getField(Object thiz, String fieldName) {
		try {
			// TODO: it only works for non-inherited fields
			Field field = thiz.getClass().getDeclaredField(fieldName);
			if (!(field.isAccessible())) {
				field.setAccessible(true);
			}
			return field.get(thiz);
		} catch (IllegalArgumentException e) {
			throw new RuntimeException(
					"Error while reading current field value: "
							+ thiz.getClass() + "." + fieldName, e);
		} catch (SecurityException e) {
			throw new RuntimeException(
					"Error while reading current field value: "
							+ thiz.getClass() + "." + fieldName, e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(
					"Error while reading current field value: "
							+ thiz.getClass() + "." + fieldName, e);
		} catch (NoSuchFieldException e) {
			throw new RuntimeException(
					"Error while reading current field value: "
							+ thiz.getClass() + "." + fieldName, e);
		}
	}

}