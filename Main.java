package ru.mail.dimapilot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		Operation op = new Operation();
		Class<?> opClass = op.getClass();

		try {
			Method method = opClass.getDeclaredMethod("test", int.class, int.class);
			Test myTest = method.getAnnotation(Test.class);

			method.invoke(op, myTest.a(), myTest.b());

		} catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
		}
	}

}
