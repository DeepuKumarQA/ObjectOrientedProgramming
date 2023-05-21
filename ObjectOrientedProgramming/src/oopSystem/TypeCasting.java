package oopSystem;

public class TypeCasting {

	public static void main(String[] args) {
		// Narrowing TypeCasting means Convert high to low

		double d = 5.9;
		int i = (int) d;
		System.out.println(d);
		System.out.println(i);

		// String to integer value conversion

		String S = "32212412";
		int s = Integer.parseInt(S); // Integer.parseInt(S)
		System.out.println(S);
		System.out.println(s);

		// String to long value conversion
		long l = Long.parseLong(S);
		System.out.println(l);

		// String to float value conversion
		float f = Float.parseFloat(S);
		System.out.println(f);

		// String to float value conversion
		double d1 = Double.parseDouble(S);
		System.out.println(d1);

		// Integer to string conversion

		int A1 = 221213;
		String a2 = String.valueOf(A1); // String.valueOf(A1)
		System.out.println(a2);

		// Widening TypeCasting means Convert low to high

		int I = 212;
		double d2 = (double) I;
		System.out.println(d2);

	}

}
