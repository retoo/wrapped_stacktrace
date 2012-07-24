package com.example;


import org.apache.log4j.Logger;

public class Test {
	public static final Logger log = Logger.getLogger(Test.class);

	public static void someJavaMethod(CallbackInterface callback) {
		try {
			callback.doTheCallBack();
		} catch (Exception e) {
		  /*** this part only illustrates that it works fine with log4j ***/
			// System.err.println("first we log the actual exception with log4j:");
			// log.error("message", e);
			// System.err.println("--------------------------------");
			// System.err.println("now we wrap it in a java exception and log it with log4j again:");
			// RuntimeException wrappedException = new RuntimeException("test",  e);
			// log.error("warpped", wrappedException);
			// System.err.println("--------------------------------");
			// System.err.println("now we print some raw details about the exception: ");
			// System.err.println(e.getClass());
			// for (StackTraceElement el : e.getStackTrace()) {
			// 	System.err.println("=> " + el);
			// }
			// System.err.println(e.getCause());
			// System.err.println("--------------------------------");
			// System.err.println("now lets wrap the exception and reraise it (this is actual bug) ");
		  /*** this illustrates my problem ***/
			throw new RuntimeException(e);
		}
	}
}
