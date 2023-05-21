package oopSystem;

public abstract class Abstraction { //abstract class can have abstract or non-abstract method
	
	int a=20; // this is global variable 
	static int b=30; // this is static variable
	final int c=1000; // this is final variable 
	
	abstract void methodAbstract(); // this is abstract method with no method body
	
	public void methodNonAbstract(){ // this is non-abstract method with no method body
		System.out.println("This is non-abstract method");
	}

	}
