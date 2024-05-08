import java.util.Scanner;
 class NP2
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
 
        int n = scanner.nextInt();
        System.out.println("--------The Pattern is-------"); 
	
        for(int i=1;i<=n;i++) 
        {
		  for(int j=1;j<=i;j++)
           
           {
			  if(i==n||j==1||j==i)
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