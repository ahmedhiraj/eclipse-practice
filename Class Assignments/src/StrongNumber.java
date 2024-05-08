import java.util.Scanner;

public class StrongNumber {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		String str=s.nextLine();
		int num=Integer.parseInt(str);
		int n=str.charAt(0)-48;
		int m=str.charAt(1)-48;
		int p=str.charAt(2)-48;
		int fact1=1;
		int fact2=1;
		int fact3=1;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			fact1=fact1*i;
		}
		for(int j=1;j<=m;j++)
		{
			fact2=fact2*j;
		}
		for(int k=1;k<=p;k++)
		{
			fact3=fact3*k;
		}
		sum=fact1+fact2+fact3;
		
		if(sum==num)
		{
			System.out.println("This is a strong number");
		}
		else
		{
			System.out.println("This is not a strong number");
		}
		
		
	}

}