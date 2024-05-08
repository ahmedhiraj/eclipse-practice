import java.util.Scanner;
public class Farmer {
		private float p;
		private float t;
		private float si;
		static float r=2.5f;
		public void input()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the loan amount");
			p=s.nextFloat();
			System.out.println("Enter the duration");
			t=s.nextFloat();
		}
		public void calculate()
		{
			si=(p*r*t)/100;
		}
		public void display()
		{
			System.out.println(si);
		}
}
