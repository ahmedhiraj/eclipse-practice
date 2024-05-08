import java.util.Scanner;
public class NonRepeatedChar {

	
	public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
		  String str=s.nextLine();
		System.out.println("First non repeated character is:"+nonRepeatedChar(str));		
	}	
	public static Character nonRepeatedChar(String s2)
	{
	    char ch[]=s2.toCharArray();
		for(int i=0;i<s2.length();i++)
		{
			if(s2.lastIndexOf(ch[i])==s2.indexOf(ch[i]))
			{
			 	return ch[i];
			 
			}
		}
		return null;
	
	}	
 }

