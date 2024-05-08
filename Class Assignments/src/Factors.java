import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//int sum=0;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				//System.out.println(i);
				//sum=sum+i;
				System.out.print(i +" ");
				count++ ;
			}
		}
       //System.out.println("The Sum is: " +sum);
		System.out.println();
       System.out.println("Count : " +count);
	}

}
