
public class UniqueChar {

	public static void main(String[] args) {
		String s1="BJS COMPUTER";
		s1=s1.replace(" ","");
		char ch[]=s1.toCharArray();
		int res[]= new int[26];
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65;
				res[index]++;
		}
	    for(int i=0;i<res.length;i++)
		{
		if(res[i]>1)
		{
			System.out.print("The string is not unique");
			System.exit(0);
		}
		
			
		}
	    System.out.print("The string is unique");

	}

}
