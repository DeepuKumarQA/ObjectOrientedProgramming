package oopSystem;

public class Abstract1 extends Abstraction {

	public static void main(String[] args) {
		Abstract1 abs = new Abstract1();
		abs.methodAbstract();
		abs.methodNonAbstract();
	}

	@Override
	void methodAbstract() { // override method from class Abstraction
		System.out.println("This is Abstract method");
	}
		
	
}
