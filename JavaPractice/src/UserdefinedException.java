
public class UserdefinedException 
{
	public static void main(String[] args) 
	{
		try 
		{
			throw new myexcep();
		} 
		catch (myexcep e) 
		{
			System.out.println(e.run());
		}
	}
}

class myexcep extends Exception
{
	public String run()
	{
		//System.out.println("mmmmmmmm");
		return "my exception";
	}
}

//
//// A Class that represents use-defined expception 
//class MyException extends Exception 
//{ 
////    public MyException(String s) 
////    {  
////        super(s);
////    } 
//    public String myexcep()
//    {
//    	return "Hi";
//    }
//} 
//  
//// A Class that uses above MyException 
//public class UserdefinedException 
//{ 
//    // Driver Program 
//    public static void main(String args[])
//    { 
//        try {
//			throw new MyException();
//		} catch (MyException e) {
//			System.out.println(e.myexcep()); 
//		}
//    } 
//} 