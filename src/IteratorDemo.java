import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		for(int i=0;i<=10;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
		Iterator i=al.iterator();
		System.out.println(i.getClass().getName());
		while(i.hasNext())
		{
			Integer i1=(Integer) i.next() ;
			if(i1%2==0)
			{
				System.out.println(i1);
			}
			else
				i.remove();
		}
		System.out.println(al);

	}

}
