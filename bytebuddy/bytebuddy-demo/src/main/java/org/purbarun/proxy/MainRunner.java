package org.purbarun.proxy;

import java.lang.reflect.InvocationTargetException;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;

public class MainRunner {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException, SecurityException, InstantiationException, IllegalArgumentException {
		Class<? extends MyService> type = new ByteBuddy().subclass(MyService.class).method(ElementMatchers.isMethod())
				.intercept(Advice.to(MyServiceInterceptor.class)).make().load(MyService.class.getClassLoader())
				.getLoaded();

		type.getDeclaredMethod("myMethod", String.class).invoke(type.getDeclaredConstructor().newInstance(), "Test");
	}
}
