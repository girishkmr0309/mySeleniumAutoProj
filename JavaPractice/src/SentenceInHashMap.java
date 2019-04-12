import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SentenceInHashMap 
{	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(toMap(str));
		System.out.println("Enter the key: ");
		String s1 = scn.nextLine();
		System.out.println(toMap(str).get(s1));
	}
	
	public static Map<String, Integer> toMap(String str) 
	{
		Map<String, Integer> myMap = new HashMap<String, Integer>();

		String[] pairs = str.split(" ");
		for (int i=0;i<pairs.length;i++) 
		{
		    String pair = pairs[i];
		    String[] keyValue = pair.split(":");
		    myMap.put(keyValue[0], Integer.valueOf(keyValue[1]));
		}
		return myMap;
	}
}
