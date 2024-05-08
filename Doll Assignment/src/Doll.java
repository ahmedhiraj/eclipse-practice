
import java.util.Scanner;
class Doll
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=s.nextInt();
		//HEAD
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) //1
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)  //2
			{
				if((i>=n/2&&j==i)||(i>=n/2&&j==n-1-i)||(j==n/2&&i>n/4&&i<=n/2)||(j==i&&i>n/4)||(j==n-1-i&&i>n/4)||(i>=n/2&&j<=i&&j>=n-1-i))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) //3
			{
				System.out.print(" ");
			}
			System.out.println();
		}
          //FACE
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)  //1
			{
				if((i<=n/4&&j==n-1-i)||(i<=n/2&&j==n/2+i&&j>=3*n/4))
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) //2
			{
				if((i==0&&j!=0&&j!=n-1)||(i==n-1&&j!=0&&j!=n-1)||(j==0&&i!=0&&i!=n-1)||(j==n-1&&i!=0&&i!=n-1)||(i==n/4&&j==n/4)||(i==n/4&&j==n/4+1)||(i==n/4&&j==3*n/4-1)||(i==n/4&&j==3*n/4)||(i>=n/4&&i<=n/2&&j==n/2&&i!=n/4&&i!=n/4+1)||(i==n-3&&j>n/4+1&&j<3*n/4-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			for(int j=0;j<n;j++)  //3
			{
				if((j==i&&j<=n/4&&i<=n/4)||(j<=n/4&&i>=n/4&&i==n/2-j))
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		    //BODY
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)  //1
			{
			 if(i==n/4||i==n/4-1)
				{
				 System.out.print("*");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)   //2
			{
				if(i==0||i==n-1||j==0||j==n-1||j==i||j==n-1-i||j==n/2||i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)  //3
			{
			 if(i==n/4||i==n/4-1)
				{
				 System.out.print("*");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			System.out.println();
		}
         //1.WAIST
		 for(int i=0;i<n;i++)
		{
			 for(int j=0;j<n;j++)  //1
			{
				 if(j>=n-1-i)
				{
					 System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)   //2
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)   //3
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		 //2.WAIST & PANT
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)   //1
			{
				if(i<=n/2||j==0||j==n-1||i==n-1)
				{
			     System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)  //2
			{
			    if(i<=n/2)
				{
			     System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)  //3
			{
			     if(i<=n/2||j==0||j==n-1||i==n-1)
				{
			     System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		   // LEGS
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)   //1
			{
				if((i<=3*n/4&&j==n/4)||(i<=3*n/4&&j==3*n/4)||i==3*n/4||i==n-1||(j==0&&i>=3*n/4)||(j==n-1&&i>=3*n/4)||i>=3*n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)  //2
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)    //3
			{
				if((i<=3*n/4&&j==n/4)||(i<=3*n/4&&j==3*n/4)||i==3*n/4||i==n-1||(j==0&&i>=3*n/4)||(j==n-1&&i>=3*n/4)||i>=3*n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}

			System.out.println();
		}
					
	}
}