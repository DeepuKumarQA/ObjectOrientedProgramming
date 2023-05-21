package oopSystem;

public final class Encapsulation { // this is final class further we can not inherit this class
	String s = "String Test";
	static final int s1 = 12345; // this is final variable further we can not change the value of the variable

	public static final void method() { // this is final method further we can not override the method in other class
		System.out.println("the final method");
	}

	public static void main(String[] args) {
		System.out.println(s1);
		method();

	}

}
