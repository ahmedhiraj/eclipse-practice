
public class CapitalizedWord {

	public static void main(String[] args) {
		char res[]=capitalizedWord();
		for(int i=0;i<=res.length-1;i++)
		{
			System.out.print(res[i]);
		}	

	}
public static char[] capitalizedWord()
{
	String str="raam is good person";
	str=str.concat("\0");
	char ch[]=str.toCharArray();
	ch[0]=(char)(ch[0]-32);
	int i=1;
	while(ch[i]!='\0')
	{
		if(ch[i]==' ')
		{
			i++;
			ch[i]=(char)(ch[i]-32);
		}
		i++;
	}
	return ch;
}
}
