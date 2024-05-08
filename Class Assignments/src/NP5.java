import java.util.Scanner;
 class NP5
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
 
        int n = scanner.nextInt();
        System.out.println("--------The Pattern is-------"); 
	    int k=1;
        for(int i=1;i<=n;i++) 
        {
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(k++ +" ");
		  }
		
		  System.out.println();
			
        }
 
        
    }
}