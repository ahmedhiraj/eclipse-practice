
public class StringPalindrome {

	public static void main(String[] args) {
		String s1="MYM";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		boolean res=s1.equals(s2);
      if(res==true)
      {
    	  
    	  System.out.println("A palindrome string");
      }
      else
      {
    	  System.out.println("Not a palindrome string");
      }
	}

}
