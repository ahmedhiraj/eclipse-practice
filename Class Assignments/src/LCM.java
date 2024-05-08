import java.util.Scanner;

public class LCM {   
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		System.out.println("Enter the second number:");
		int n=s.nextInt();
		int m=s.nextInt();
		int hcf=0;
		int lcm=0;
		for(int i=m;i>=1;i--)
		{
			if(m%i==0 && n%i==0)
			{
				hcf=i;
				break;
				
			}
			
		}
		
		
		System.out.println("HCF is " +hcf);
		lcm=(m*n)/hcf;
		System.out.println("LCM is " +lcm);
		
	}

}
