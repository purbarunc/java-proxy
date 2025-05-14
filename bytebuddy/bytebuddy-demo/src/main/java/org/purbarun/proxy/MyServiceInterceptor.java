package org.purbarun.proxy;

import net.bytebuddy.asm.Advice.OnMethodEnter;
import net.bytebuddy.asm.Advice.OnMethodExit;

public class MyServiceInterceptor {
	@OnMethodEnter
	static void enter() {
		System.out.println("before myMethod");
	}

	@OnMethodExit
	static void exit() {
		System.out.println("after myMethod");
	}
}
