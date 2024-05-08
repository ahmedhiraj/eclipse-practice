import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class Cricketer
{
	String name;
	int runs;
	float avg;
	public Cricketer(String name,int runs,float avg)
	{
		this.name=name;
		this.runs=runs;
		this.avg=avg;
	}
	public String toString()
	{
		return name+" "+runs+" "+avg;
	}
}
class Alpha implements Comparator
{
	public int compare(Object x,Object y)
	{
		if(((Cricketer)(x)).avg>((Cricketer)(y)).avg)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class Practice
{
	public static void main(String[]args)
	{
		Cricketer c1=new Cricketer("Hiraj",5000,25.5f);
		Cricketer c2=new Cricketer("Banty",3500,35.5f);
		Cricketer c3=new Cricketer("Ahamed",6500,45.5f);
		ArrayList al=new ArrayList();
		al.add(c2);
		al.add(c3);
		al.add(c1);
		System.out.println(al);
		Alpha a=new Alpha();
		
		Collections.sort(al,a);
		System.out.println(al);
		
	}
	
}