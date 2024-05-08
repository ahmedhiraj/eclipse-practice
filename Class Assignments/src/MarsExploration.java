
public class MarsExploration {

	public static void main(String[] args) {
		String s="SOSSPSSQSSOR";
		String s1="";
		int signal=s.length()/3;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='S'&&s.charAt(i)!='O')
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println("Number of signals :"+signal);
		System.out.println("Letters changed by "+s1.length()+ " times");
		
		
	}

}
