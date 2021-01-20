import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		System.out.println(l.size());
		l.add("jithu");
		System.out.println(l);
		l.add(30);
		System.out.println(l);
		l.add(null);
		System.out.println(l);
		l.add("jithu");
		System.out.println(l);
		l.set(0,"jithendra");
		System.out.println(l);
		l.add(0,"ji");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("First");
		System.out.println(l);

	}

}
