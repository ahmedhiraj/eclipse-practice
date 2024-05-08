import java.util.ArrayList;
import java.util.Collections;

public class ReverseCollections {

	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println("Reverse Collections");
		Collections.replaceAll(al,20,555);
		System.out.println(al);
		
	}

}
