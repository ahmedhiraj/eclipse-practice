import java.util.ArrayDeque;
public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque ad= new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		System.out.println(ad);
		ad.addFirst(101);
		ad.addLast(111);
		System.out.println(ad);
		ad.removeFirst();
		System.out.println(ad);
		ad.removeLast();
		System.out.println(ad);
		ad.removeLast();
		System.out.println(ad);

	}

}
