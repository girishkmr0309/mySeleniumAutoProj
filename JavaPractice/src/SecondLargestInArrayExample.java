import java.util.Scanner;

public class SecondLargestInArrayExample 
{ 
	public static void main(String[] args)
	{
		System.out.println("Enter the size of the array: ");
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the array elements: ");
		for(int i = 0; i< size; i++)
		{
			a[i] = scn.nextInt();
		}
		System.out.println("The second largest element is: " + getSecondLargest(a));
	}
	
	public static int getSecondLargest(int[] a)
	{
		int temp;
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j = i + 1; j < a.length; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[a.length-2];
	}
}