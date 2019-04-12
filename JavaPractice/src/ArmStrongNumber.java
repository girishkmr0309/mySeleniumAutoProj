
public class ArmStrongNumber 
{
	public static void isArmstrong(int num)
	{
		System.out.println("The entered number is: " + num);
		int cube = 0;
		int r;
		int t;
		t = num;
		
		while(num>0)
		{
			r = num%10;
			num = num / 10;
			cube = cube + (r * r * r);
		}
		if(t==cube)
		{
			System.out.println("The entered num " + t + " is an Armstrong number");
		}
		else
		{
			System.out.println("The entered num " + t + " is not an Armstrong number");
		}
	}
	
	public static void main(String[] args) 
	{
		isArmstrong(150);

	}

}
