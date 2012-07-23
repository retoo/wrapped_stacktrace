package com.example;


import org.apache.log4j.Logger;

public class Test {
	public static final Logger log = Logger.getLogger(Test.class);

	public static void someJavaMethod(CallbackInterface callback) {
		try {
			callback.doTheCallBack();
		} catch (Exception e) {
			log.error("message", e);
			System.err.println("--------------------------------");
			RuntimeException wrappedException = new RuntimeException("test",  e);
			log.error("warpped", wrappedException);
			System.err.println("--------------------------------");
			System.err.println(e.getClass());
			for (StackTraceElement el : e.getStackTrace()) {
				System.err.println("=> " + el);
			}
			System.err.println(e.getCause());
			System.err.println("--------------------------------");
			throw new RuntimeException(e);
		}
	}
}
