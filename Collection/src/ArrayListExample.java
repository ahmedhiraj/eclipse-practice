import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		al.add("Hiraj");
		al.add('B');
		al.add(true);
		al.add('A');
		al.add(false);
		System.out.println(al);
		ArrayList a1=new ArrayList();
		a1.add(111);
		a1.add(1111);
		a1.add(11111);
		al.addAll(a1);
		System.out.println(al);
	    al.remove(7);
	    System.out.println(al);
	    al.add(7, "Banty");
	    System.out.println(al);
	}

}
