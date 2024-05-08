import java.util.Scanner;
class Sleeping
{
	public void sleep()
	{   Scanner scan=new Scanner(System.in);
		System.out.println("Sleeping started");
		System.out.println("Enter the sleeping time :");
		int sl=scan.nextInt();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("You have slept for "+ sl +"hours");
		System.out.println("Sleeping completed");
	}
}
class Eating
{
	public void eat()
	{   Scanner scan2=new Scanner(System.in);
		System.out.println("Eating started");
		System.out.println("Enter the amount of meat you want :");
		int mt=scan2.nextInt();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("You have eaten "+ mt +"grams of meats");
		System.out.println("Eating completed");
	}
}
class Launch implements Runnable
{
	public void run()
	{
		Sleeping s1=new Sleeping();
		Eating e1=new Eating();
		s1.sleep();
		e1.eat();
		
	}
}
public class RunMethod {

	public static void main(String[] args) {
		Launch l=new Launch();
		Thread t1=new Thread(l);
		t1.start();

	}

}
