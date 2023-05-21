package oopSystem;

public class Inheritance {
	// Types of Inheritance
	// Single level inheritance
	// multilevel inheritance
	// hierarchical inheritance

	// what is parent class : A class whose properties(attributes and methods)
	// inherit by other child classes called parent class
	// what is child class: A class which is inherited by parent class called child
	// class.

	int a = 2, b = 4; // global variable

	public int add() { // non-static method
		return (a + b);
	}

	public int mul() {
		return (a * b);
	}

	public int sub() {
		return (a - b);
	}

	public int div() {
		return (a / b);
	}

	public int mod() {
		return (a % b);
	}

	public static void main(String[] args) {

		Inheritance in = new Inheritance(); // object reference
		System.out.println(in.add()); // calling method with in object reference
		System.out.println(in.div());
		System.out.println(in.sub());
		System.out.println(in.mul());
		System.out.println(in.mod());
	}

}

// class inheritance1 and inheritance2 inherited the properties from class inheritance called hierarchical inheritance
// class inheritance2 inherited from inheritance1 and inheritance1 inherited from inheritance.
