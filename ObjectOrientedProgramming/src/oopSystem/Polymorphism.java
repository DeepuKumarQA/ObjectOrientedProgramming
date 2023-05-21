package oopSystem;

public class Polymorphism {
	int a = 10, b = 20, c = 30, d = 40;

	public void sum(int a, int b) { // this is method overloading "sum" method is overloaded with different
									// parameters
		int sum = a + b;
		System.out.println("Sum is: " + sum);
	}

	public void sum(int a, int b, int c) { // method with parameter so at the calling method we will pass the value 
		int sum = a + b + c;
		System.out.println("Sum is: " + sum);
	}

	public void sum(int a, int b, int c, int d) {
		int sum = a + b + c + d;
		System.out.println("Sum is: " + sum);
	}

	public void sum() { // method with no argument bcoz i have provided already 
		int sum = a + b;
		System.out.println("Sum is:" + sum);
	}

	public static void main(String[] args) {
//Ploymorphism means "many forms" it occurs when we have many classes that are related to each other by inheritance.
		Polymorphism plm = new Polymorphism();
		plm.sum();
		plm.sum(20, 20);
	}

}
