import java.util.Scanner;
public class ArrayEvenOddSum {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int sum=0;
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("The elements are :");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("Even indexed sum is :");
	for(int i=0;i<a.length;i++)
	{
		if(i%2==0)
		{
			sum+=a[i];
		}
	}
	System.out.println(sum);
	}

}
