
public class ToLowerCase {

	public static void main(String[] args) {
	char res[]=toLowerCase();
	for(int i=0;i<=res.length-1;i++)
	{
		System.out.print(res[i]);
	}
	}
public static char[] toLowerCase()
{
	String str="RAAM IS A GOOD BOY";
	str=str.concat("\0");
	char ch[]=str.toCharArray();
	int i=0;
	while(ch[i]!='\0')
	{
		if(ch[i]==' ')
		{
			i++;
		}
		ch[i]=(char)(ch[i]+32);
		i++;
	}
	return ch;
}
}
