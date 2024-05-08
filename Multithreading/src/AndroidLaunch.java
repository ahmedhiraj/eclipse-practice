import java.util.Scanner;
class Music implements Runnable
{
	public void run()
	{
		System.out.println("Music started");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter channel no:");
		int ch=s.nextInt();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Music is playing!!");
		System.out.println("Music Stopped");
	}
}
class Contacts implements Runnable
{
	public void run()
	{
		System.out.println("Contact searching started");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the name to search");
		String msg=s1.nextLine();
		for(int i=0;i<3;i++)
		{
		System.out.println("Contact found :"+msg);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		}
		System.out.println("Contact searching completed");
	}
}
class Calling implements Runnable
{
	public void run()
	{
		System.out.println("Calling started");
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter phone no:");
		int ph=s2.nextInt();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("Calling to "+ph);
		System.out.println("Calling Stopped");
		
	}
}
class Google implements Runnable
{
	public void run()
	{
		System.out.println("Googling started");
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter your queries here :");
		String qrs=s3.nextLine();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("Your queries are found");
		System.out.println("Googling Stopped");
		
	}
}
public class AndroidLaunch {

	public static void main(String[] args) {
		Music m=new Music();
		Contacts cts=new Contacts();
		Calling cal=new Calling();
		Google ggl=new Google();
		Thread t1=new Thread(m);
		Thread t2=new Thread(cts);
		Thread t3=new Thread(cal);
		Thread t4=new Thread(ggl);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	
	}

}
