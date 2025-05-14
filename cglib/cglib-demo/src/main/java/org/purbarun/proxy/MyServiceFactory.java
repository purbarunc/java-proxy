package org.purbarun.proxy;

import net.sf.cglib.proxy.Enhancer;

public class MyServiceFactory {
	static MyService getMyServiceObject() {
		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(new MyServiceInterceptor());
		enhancer.setSuperclass(MyService.class);
		return (MyService) enhancer.create();
	}
}
