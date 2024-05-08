import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
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
public class HashMapExample {

	public static void main(String[] args) {
		Cricketer c1=new Cricketer("Rahul",15000,55.45f);
		Cricketer c2=new Cricketer("Sourav",10000,65.45f);
		Cricketer c3=new Cricketer("Sachin",25000,85.45f);
		LinkedHashMap hm=new LinkedHashMap();
		hm.put(20,c1);		
		hm.put(30,c3);
		hm.put(10,c2);
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()==true)
		{
			System.out.println(itr.next());
		}
	}

}
