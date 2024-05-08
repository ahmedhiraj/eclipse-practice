import java.util.Scanner;
class Model1 implements Runnable
{
	public void run()
	{
		System.out.println("Banking started");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the account number");
		int ac=s.nextInt();
		System.out.println("Enter the password");
		int pw=s.nextInt();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Login successfull");
		System.out.println("Banking completed");
	}
}
class Model2 implements Runnable
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
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("Printing completed");
	}
}
class Model3 implements Runnable
{
	public void run()
	{
		System.out.println("Addition started");
		int a=10;
		int b=20;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a+b);
		System.out.println("Addition completed");
		
	}
}
public class RunnableLaunch {

	public static void main(String[] args) {
		Model1 d1=new Model1();
		Model2 d2=new Model2();
		Model3 d3=new Model3();
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		t1.start();
		t2.start();
		t3.start();
	
	}

}
