import java.util.Arrays;

public class SmallestAndLargest 
{
	public static void main(String[] args) 
	{
		int n[] = {-24, -88 , 0 , 50 , 1526};
		
		int largest = n[0];
		int smallest = n[0];
		
		for(int i = 1; i<n.length; i++)
		{
			if(n[i]>largest)
			{
				largest = n[i];
			}
			else if(n[i]<smallest)
			{
				smallest = n[i];
			}
		}
		System.out.println("The given array is: " +Arrays.toString(n));
		System.out.println("The smallest number is: " +smallest);
		System.out.println("The largest number is: " +largest);
	}

}
