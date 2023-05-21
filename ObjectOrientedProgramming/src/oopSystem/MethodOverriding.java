package oopSystem;

public class MethodOverriding extends Polymorphism { // runtime polymorphism is called method overriding or dynamic
														// binding

	public void sum(int a, int b) {
		int sum = a + b;
		System.out.println("The sum is: " + sum);
	}

	public static void main(String[] args) {
		MethodOverriding Mo = new MethodOverriding();
		Mo.sum(); // this is the method of class polymorphism
		Mo.sum(100, 200); // this is the method of methodoverriding class
	}

}
