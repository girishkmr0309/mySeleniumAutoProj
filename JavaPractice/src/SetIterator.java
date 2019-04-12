import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator 
{
	public static void main(String[] args) 
	{
		Set s = new HashSet();
		s.add("ab");
		s.add("ac");
		s.add("ad");
		s.add("bc");
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
