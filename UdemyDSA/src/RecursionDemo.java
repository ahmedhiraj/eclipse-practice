
public class RecursionDemo {
	public static void main(String [] args)
	{
		RecursionDemo recur= new RecursionDemo();
		var rec=recur.factorial(3);
		System.out.println(rec);
	}
	public int factorial(int n) {
		if(n<1) {
			return -1;
		}
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}

}
