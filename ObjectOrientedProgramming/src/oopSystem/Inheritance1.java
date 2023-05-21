package oopSystem;

public class Inheritance1 extends Inheritance {
	int x1=100;
	int x2=200;
	
	public void mathOperation() {
		System.out.println(x1+x2);
	}

	public static void main(String[] args) {
		Inheritance1 in1 = new Inheritance1();
		System.out.println(in1.add()); // class inheritance properties are inherited by child class inheritance1
		System.out.println(in1.div());
		System.out.println(in1.mul());
		System.out.println(in1.sub());
		System.out.println(in1.mod());
		// calling non-static method by creating child class object reference 
		in1.mathOperation();
	}

}
