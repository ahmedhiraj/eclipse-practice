import java.util.Scanner;

public class SampleDemo {

	public static void main(String[] args) {
		System.out.println("Please enter number");
		Scanner s=new Scanner(System.in);
		int temp=s.nextInt();
		System.out.println(temp);
		System.err.print(temp);
	}

}
