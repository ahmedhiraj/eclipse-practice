
public class StringReplace {

	public static void main(String[] args) {
		char res[]=replaceString('R','M');
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]);
		}

	}
public static char[] replaceString(char oldch,char newch)
{
	String s="RajaRamMohanRoy";
	s=s.concat("\0");
	char ch[]=s.toCharArray();
	int i=0;
	while(ch[i]!='\0')
	{
		if(ch[i]==oldch)
		{
		ch[i]=newch;
		}
		i++;
	}
	return ch;
}
}
