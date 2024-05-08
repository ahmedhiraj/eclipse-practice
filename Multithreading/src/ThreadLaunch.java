import java.util.Scanner;
class Demo1 extends Thread
{
	public void run()
	{
		System.out.println("Banking started");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the account number");
		int ac=s.nextInt();
		System.out.println("Enter the password");
		int pw=s.nextInt();
		System.out.println("Login successfull");
		System.out.println("Banking completed");
	}
}
class Demo2 extends Thread
{
	public void run()
	{
		System.out.println("Printing started");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the message");
		String msg=s.nextLine();
		for(int i=0;i<3;i++)
		{
		System.out.println(msg);
		}
		System.out.println("Printing completed");
	}
}
class Demo3 extends Thread
{
	public void run()
	{
		System.out.println("Addition started");
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println("Addition completed");
		
	}
}
public class ThreadLaunch {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		d1.start();
		d2.start();
		d3.start();
	
	}

}
