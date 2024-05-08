import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the array size :");
	int sum=0;
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("Array elements are :");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("Sum of arrays is :");
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
	}
	System.out.println(sum);

	}

}
