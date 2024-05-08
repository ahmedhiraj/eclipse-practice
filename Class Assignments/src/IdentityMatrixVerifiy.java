import java.util.Scanner;
public class IdentityMatrixVerifiy {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of rows and columns:");
		int n=scan.nextInt();
		int a[][]=new int[n][n];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter the elements at "+i+ "and at "+j);
				a[i][j]=scan.nextInt();
			}	
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j==i && a[i][j]==1)
				{
					System.out.println("It is an identical matrix");
					System.exit(0);
				}
				else if(i!=j&& a[i][j]==0)
				{
					System.out.println("It is not an identical matrix");
					System.exit(0);
				}
			}	
		}
		
	}

}
