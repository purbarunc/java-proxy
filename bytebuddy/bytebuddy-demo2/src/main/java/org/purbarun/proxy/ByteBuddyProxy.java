package org.purbarun.proxy;

import java.lang.reflect.InvocationHandler;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.InvocationHandlerAdapter;
import net.bytebuddy.matcher.ElementMatchers;

public class ByteBuddyProxy {
	public static <T> T createProxy(Class<T> targetClass, InvocationHandler handler) {
		try {
			return new ByteBuddy().subclass(targetClass).method(ElementMatchers.any())
					.intercept(InvocationHandlerAdapter.of(handler)).make().load(targetClass.getClassLoader())
					.getLoaded().getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			throw new RuntimeException("Failed to create proxy for " + targetClass.getName(), e);
		}
	}
}
