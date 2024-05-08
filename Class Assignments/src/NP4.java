
import java.util.Scanner;
 class NP4
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
 
        int n = scanner.nextInt();
        System.out.println("--------The Pattern is-------"); 
		int k=1;
		int l=3;
        for(int i=1;i<=n;i++) 
        {
		  
           for(int j=1;j<=n;j++) 
            {
        	   if(j<=i)
        	   {
				System.out.print(k-- +"  ");
        	   }
        	   else
        	   {
        		   System.out.print(" ");
        	   }
			}
           k=k+l;
           l=l+2;
 
            System.out.println();
			
        }
 
        
    }
}