import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		System.out.println("Connection is established");
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the numerator");
			int num1=s.nextInt();
			System.out.println("Enter the denominator");
			int num2=s.nextInt();
			int result=num1/num2;
			System.out.println("Result:" +result);
		    int a[]=new int[3];
		    System.out.println(a[8]);
		}
		catch(ArithmeticException arme)
		{
			System.out.println("You are trying to divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException aibe)
		{
			System.out.println("Please provide index within the size");
		}		
		catch(Exception e)
		{
			System.out.println("Some different exception is caught here");
		}
		System.out.println("Connection is terminated");
	}

}
