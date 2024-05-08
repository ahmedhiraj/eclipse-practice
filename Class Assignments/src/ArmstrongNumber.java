import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the Number :");
	int n =scan.nextInt();
	String s=""+n;
	int length=s.length();
	double sum=0;
	for(int i=0;i<length;i++)
	{
		int n1=s.charAt(i)-48;
		sum=sum+Math.pow(n1,length);
	}
	
if (sum==n)
{
	System.out.println("It is an Armstrong number");
}
else
{
	System.out.println("It is not an Armstrong number");
}
	}

}
