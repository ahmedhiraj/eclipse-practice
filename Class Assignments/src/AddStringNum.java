
public class AddStringNum {

	public static void main(String[] args) {
		String s="B1J2S a3r1e y8ou9";
	    String alpha="";
	    int num=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=97 && s.charAt(i)<=122 ||s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				alpha+=s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num+=s.charAt(i)-48;
			}
			else if(s.charAt(i)==' ')
			{
				System.out.print(alpha+num+" ");
				alpha="";
				num=0;
			}
		}
		System.out.print(alpha+num);
	}

}
