
public class LongestPalindrome {

	public static void main(String[] args) {
		
		String s="aabca";
		//String s1=s.substring(0, 3);
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=1;j<s.length();j++)
			{
				s1+=s.substring(i, j);
			}
		}
		System.out.println(s1);
	}

}
