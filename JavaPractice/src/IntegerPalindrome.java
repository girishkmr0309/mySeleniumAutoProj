
public class IntegerPalindrome 
{
	public static void main(String[] args) 
	{
		int num = 12;
		int t = num;
		int rev = 0;
		
		while(t!=0)
		{
			rev = rev * 10 + t % 10;
			t = t / 10;
		}
		if(rev == num)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
