import java.util.Scanner;
public class IdentityMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of rows and columns:");
		int n=scan.nextInt();
		
		int a[][]=new int[n][n];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j==i)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
		
	}

}
