
public class CompiletimeAndRuntimePolymorphism 
{
	public static void main(String[] args) 
	{
		run1 r1 = new run1();
		run2 r2 = new run2();
		
		run1 ref;
		ref = r1;
		ref.m1(10);
		ref.m1();
		ref = r2;
		ref.m1();
		ref.m1(10);
	}
}

class run1
{
	public void m1(int i)
	{
		System.out.println("One argument r1");
	}
	public void m1()
	{
		System.out.println("No argument r1");
	}
}
class run2 extends run1
{
	public void m1(int i)
	{
		System.out.println("One argument r2");
	}
	public void m1()
	{
		System.out.println("No argument r2");
	}
}
