
public class StringPalindrome2 {

	public static void main(String[] args) {
		String s1="My Gym";
		String s2="";
		s1= s1.replace(" ", "");
		for(int i=s1.length()-1;i>=0;i--)
		{
			
			s2=s2+s1.charAt(i);
		}
	 boolean res1=s1.equalsIgnoreCase(s2);
      if(res1==true)
      {
    	  
    	  System.out.println("A palindrome string");
      }
      else
      {
    	  System.out.println("Not a palindrome string");
      }
	}

}
