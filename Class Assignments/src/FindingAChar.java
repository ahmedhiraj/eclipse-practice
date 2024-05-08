import java.util.Scanner;
public class FindingAChar {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String str="RajaRamMohanRoy";
		char ch[]=str.toCharArray();
		System.out.println("Type index number to find the character");
		int n=scan.nextInt();
		if(n<=ch.length-1)
		{
		System.out.println(ch[n]);
		}
		else
		{
			System.out.println("Index number is out of length");
		}
	}

}
