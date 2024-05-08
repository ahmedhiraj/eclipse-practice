
public class CDSVWCounts {

	public static void main(String[] args) {
	String s1="SACHIN IS THE #1 PLAYER";
	int vowcnt=0;
	int concnt=0;
	int digcnt=0;
	int specialcnt=0;
	int whitecnt=0;
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)>='A'&& s1.charAt(i)<='Z')
		{
			if(s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')
			{
				vowcnt++;
			}
			else
			{
				concnt++;
			}
		}
		else if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
		{
			digcnt++;
		}
		else if(s1.charAt(i)==' ')
		{
			whitecnt++;
		}
		else
		{
			specialcnt++;
		}
	}
   System.out.println("Vowel :" +vowcnt);
   System.out.println("Consonants :" +concnt);
   System.out.println("Digits :" +digcnt);
   System.out.println("Whitespaces :" +whitecnt);
   System.out.println("Specialcharacters :" +specialcnt);

	}

}
