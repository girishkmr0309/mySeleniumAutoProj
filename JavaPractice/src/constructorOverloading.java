
public class constructorOverloading
{
	public static void main(String[] args)
	{
		presentor p = new presentor("girish");
		System.out.println(p.name);
	}
}
class presentor
{
	String name;
	int a;
	
	presentor(int a)
	{
		this.a=a;
	}
	presentor(String name)
	{
		this.name = name;
	}
}