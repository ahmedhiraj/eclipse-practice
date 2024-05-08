import java.util.Scanner;
public class DefaultValuesOfDataTypes {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=scan.nextInt();
		//int a[][]=new int[n][n];
		//char a[][]=new char[n][n];
		//float a[][]=new float[n][n];
		String a[][]=new String[n][n];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
