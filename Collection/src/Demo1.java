import java.util.ArrayList;
import java.util.LinkedList;
public class Demo1 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println(ll);
        ll.addFirst(5);
        ll.addLast(50);
        System.out.println(ll);
        ll.peek();
        System.out.println(ll);
        ll.poll();
        System.out.println(ll);
        ll.peek();
        System.out.println(ll);
        ll.poll();
        System.out.println(ll);
        ll.peek();
        System.out.println(ll);
        ll.poll();
        System.out.println(ll);
        ll.offer(90);
        System.out.println(ll);
        
	}

}
