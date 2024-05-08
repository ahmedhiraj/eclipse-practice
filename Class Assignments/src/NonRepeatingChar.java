
public class NonRepeatingChar {

	public static void main(String[] args) {
		String s1="WELCOME TO BJS";
		s1=s1.replace(" ","");
		char ch[]=s1.toCharArray();
		int res[]= new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			
			res[i]++;			
		}
	    for(int i=0;i<res.length;i++)
		{
		if(res[i]==1)
		{
			System.out.println(ch[i]);
		}
		
		}

	}

}
