package basics;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=7;
		
//		– If n and m are integers to be divided, and the fractional portion of the result must be preserved, 
//		at least one of the two must be type cast to a floating-point type before the division operation is performed
		double c = a/(double)b;  // So b is type casted as a double to get the fractional portion
		double d = a/b; 
		System.out.println("Fractional portion preserved: "+c+" and Not preserved: "+d);
		
//		When type casting from a floating-point to an integer type, the number is truncated, not rounded
		float e = 3.95f;
		System.out.print("Type casting float to int: "+(int)e);
		
	}

}
