import java.util.Scanner;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string to check if palindrome");
		String s = scn.nextLine();
		String rev = "";
		String t = s;
		for(int i = t.length()-1;i>=0;i--)
		{
			rev = rev + t.charAt(i);
		}
		System.out.println("The String entered is: " +s);
		System.out.println("The reversed string is: "+rev);
		
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb.reverse());

		if(rev.equals(t))
		{
			System.out.println("The string is palindrome");
		}
		else
		{
			System.out.println("The string is not palindrome");
		}
		
	}

}
