import java.util.Arrays;

public class StringAnagram {
	public static void main(String [] args)
	{
		String s1="STUDY";
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch1);
		String s2="DUSTY";
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch2);
		
		if (Arrays.equals(ch1, ch2))
		{
			System.out.println("The two strings are anagram");
		}
		else
		{
			System.out.println("The two strings are not anagram");
		}
	}

}
