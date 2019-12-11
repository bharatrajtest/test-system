package com.testing.objectrepository;

/**
 * This class is base class for all elements across the application under test
 * It implements all the interfaces where the elements are defined as public members  
 */
public class BaseLocators implements ProcessingLocators,ProcessingLocators2{
	
	/**
	 * @param key
	 * @return 
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * This method returns a Field object that reflects the specified public member field of the class or interface 
	 * represented by this Class object. 
	 * The key parameter is a String specifying the name of the desired field.
	 */
	public static String getLocator(String key) throws IllegalArgumentException, IllegalAccessException, SecurityException {
		try {
			return BaseLocators.class.getField(key).get((BaseLocators.class)).toString();
		} catch (Exception e) {
			return key;
		}
	
	}
}
