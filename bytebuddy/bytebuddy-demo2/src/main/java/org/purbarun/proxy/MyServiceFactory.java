package org.purbarun.proxy;

public class MyServiceFactory {
	static MyService getMyServiceObject() {
		return ByteBuddyProxy.createProxy(MyService.class, new MyInvocationHandler(new MyService()));
	}
}
