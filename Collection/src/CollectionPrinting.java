import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionPrinting {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println("Using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("Using Iterator");
		Iterator itr=al.iterator();
		while(itr.hasNext()==true)
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("Using ListIterator Forward");
		ListIterator litr=al.listIterator();
		while(litr.hasNext()==true)
		{
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		System.out.println("Using ListIterator Backward");
		ListIterator litr1=al.listIterator(al.size());
		while(litr1.hasPrevious()==true)
		{
			System.out.print(litr1.previous()+" ");
		}
		
	}

}
