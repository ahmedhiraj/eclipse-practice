
public class StringPangram {

	public static void main(String[] args) {
		String s1="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		s1=s1.replace(" ","");
		char ch[]=s1.toCharArray();
		int res[]= new int[26];
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65;
				res[index]=1;
			
			
		}
	    for(int i=0;i<res.length;i++)
		{
		if(res[i]==0)
		{
			System.out.println("Not a Pangram");
			System.exit(0);
		}
		
		}
	    System.out.println("Pangram");
	}

}
