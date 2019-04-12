import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String s = scn.nextLine();
//		String rev = "";
//		for(int i = s.length()-1;i>=0;i--)
//		{
//			rev = rev + s.charAt(i);
//		}
//		System.out.println("The String entered is: " +s);
//		System.out.println("The reversed string is: "+rev);
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
	