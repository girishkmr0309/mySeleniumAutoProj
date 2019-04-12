
public class SingletonDesign 
{
	public static void main(String[] args) 
	{
		gmail u1 = gmail.getinstance();
		System.out.println(u1);
		gmail u2 = gmail.getinstance();
		System.out.println(u2);
	}
}

class gmail
{
	static gmail obj = null;
	private gmail()
	{
		
	}
	static public gmail getinstance()
	{
		if(obj==null)
		{
			obj = new gmail();
		}
		return obj;
	}
}
