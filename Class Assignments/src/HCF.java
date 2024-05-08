import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		System.out.println("Enter the second number:");
		int n=s.nextInt();
		int m=s.nextInt();
		for(int i=m;i>=1;i--)
		{
			if(m%i==0 && n%i==0)
			{
				System.out.print("HCF is : " +i);
				break;
			}
		}
		
	}

}
