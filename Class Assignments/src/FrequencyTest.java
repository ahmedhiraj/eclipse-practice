import java.util.Scanner;
public class FrequencyTest {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int count=0;
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("The element you want to check :");
	int m=s.nextInt();
	for(int i=0;i<a.length;i++)
	{
	if(m==a[i])
	{
	 count++;
	}
	}
	if(count==0)
	{
		System.out.println("Element is not inside");
	}
	else
	{
	System.out.println("The number of occurances is :" +count);
	}
}
}
