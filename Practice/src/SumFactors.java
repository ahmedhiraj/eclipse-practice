import java.util.Scanner;
public class SumFactors {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=s.nextInt();
	int sum=0;
	for(int i=1;i<=a;i++)
	{
		if(a%i==0)
		{
			sum+=i;
		}
	}
	System.out.println("The sum of the factors are :"+sum);

	}

}
