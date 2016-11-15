package ru.mail.dimapilot;

public class Operation {

	@Test(a = 2, b = 5)
	public void test(int a, int b) {
		int c = a + b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a + b = " + c);
	}
}
