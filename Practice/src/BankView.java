
public class BankView {
private int id;
private String name;
private float balance;
public void setData(int x,String y,float z)
{
	id=x;
	name=y;
	balance=z;
}
public int getId()
{
	return id;
}
public String getName()
{
	return name;
}
public float getBalance()
{
	return balance;
}
}
