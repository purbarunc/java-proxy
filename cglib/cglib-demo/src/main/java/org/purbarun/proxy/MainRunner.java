package org.purbarun.proxy;

public class MainRunner {
	public static void main(String[] args) {
		MyService myService = MyServiceFactory.getMyServiceObject();
		myService.myMethod("Test");
	}
}
