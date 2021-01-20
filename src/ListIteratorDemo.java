import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l);
		ListIterator ltr=l.listIterator();
		System.out.println(ltr.getClass().getName());
		while(ltr.hasNext())
		{
			String s=(String)ltr.next();
			System.out.println(s);
			if(s.equals("A"))
			{
				ltr.remove();
			}
			else if(s.equals("B"))
			{
				ltr.add("b");
			}
			
			else if(s.equals("C"))
			{
				ltr.set("c");
			}
			else if(s.equals("b"))
				{
				ltr.set("bb");
				}
			System.out.println(l);
		}
		

	}

}
