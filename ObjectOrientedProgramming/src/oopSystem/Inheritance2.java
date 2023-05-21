package oopSystem;

public class Inheritance2 extends Inheritance1 { // by using extends keyword we can inherit the class attributes and
													// methods

	public static void main(String[] args) {
		Inheritance2 in2 = new Inheritance2();
		in2.mathOperation();// calling inheritance1 class method in inheritance2 class
		
		System.out.println(in2.add()); // inherited from class inheritance this is 
		System.out.println(in2.div());
		System.out.println(in2.mul());
		System.out.println(in2.sub());
		System.out.println(in2.mod());
	}

}
