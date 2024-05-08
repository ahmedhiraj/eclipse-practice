
public class ArrayMultiplication {

	public static void main(String[] args) {
		
   int a [][]={{1,2,3},{1,2,3},{1,2,3}};
   int b [][]={{1,2,3},{1,2,3},{1,2,3}};
   int c [][]=new int[3][3];
   
   for(int i=0;i<a.length;i++)
   {
	   for(int j=0;j<b[i].length;j++)
	   {
		   for(int k=0;k<a[i].length;k++)
		   {
			   c[i][j]=c[i][j]+a[i][k]*b[k][j];
		   }
	   }
		   
   }
   for(int i=0;i<c.length;i++)
   {
	   for(int j=0;j<c[i].length;j++)
	   {
		   System.out.print(c[i][j]+" ");
		   
	   }
		System.out.println();   
   }
   }
	

}
