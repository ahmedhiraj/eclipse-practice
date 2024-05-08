
public class ToUpperCase {

	public static void main(String[] args) {
		char res[]=toUpperCase();
		for(int i=0;i<=res.length-1;i++)
		{
			System.out.print(res[i]);
		}
	}
	public static char[] toUpperCase()
	{
		String str="raam";
		str=str.concat("\0");
		char ch[]=str.toCharArray();
		int i=0;
		while(ch[i]!='\0')
		{
			ch[i]=(char)(ch[i]-32);
			i++;
		}
		return ch;
	}
}
