
public class SwapIntegers 
{
	public static void main(String[] args) 
	{
		int x = 5;
		int y = 10;
		
		//1. using temp variable
//		int t;
//		t = x;
//		x = y;
//		y = t;
//		System.out.println(x);
//		System.out.println(y);
		
		//2. using addition logic
//		x = x + y;
//		y = x - y;
//		x = x - y;
//		System.out.println(x);
//		System.out.println(y);
		
		//3. using multiplication logic
//		x = x * y;
//		y = x / y;
//		x = x / y;
//		System.out.println(x);
//		System.out.println(y);
		
		//4. using XOR operator
//		x = x ^ y;
//		y = x ^ y;
//		x = x ^ y;
//		System.out.println(x);
//		System.out.println(y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x);
		System.out.println(y);
	}

}
