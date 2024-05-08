
public class Bank {
	private int password;
	public void setData(int x)
	{
		if(x==1234)
		{
			System.out.println("log in successful");
		}
		else
		{
			System.out.println("wrong password");
			System.exit(0);
		}
	}
	public String getData()
	{
		return"Banking Successful";
	}

}
