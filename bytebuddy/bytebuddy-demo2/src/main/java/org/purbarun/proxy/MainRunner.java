package org.purbarun.proxy;

import java.lang.reflect.InvocationTargetException;

public class MainRunner {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException, SecurityException, InstantiationException, IllegalArgumentException {
		MyService myService = MyServiceFactory.getMyServiceObject();
		myService.myMethod("Test");
	}
}
