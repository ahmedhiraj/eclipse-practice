import java.util.Scanner;
public class Shining {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the larger number");
		int a=scan.nextInt();
		System.out.println("Enter another number");
		int b=scan.nextInt();		
		for(int i=a;i>=1;i--)
		{
			if(a%i==0 && b%i==0)
			{
				System.out.println("HCF is  : " +i);
				break;
			}
		}
		
	}

}
