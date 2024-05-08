import java.util.Scanner;
public class RightDiagonalMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of rows and columns:");
		int n=scan.nextInt();
		int a [][]=new int[n][n];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter the elements at "+i+ "and at "+j);
				a[i][j]=scan.nextInt();
			}
			
		}
		System.out.println("Right diagonal Matrix is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j==n-1-i)
				{
					System.out.print(a[i][j]);
					sum+=a[i][j];
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println("The sum of the elements are :" +sum);
	}

}
