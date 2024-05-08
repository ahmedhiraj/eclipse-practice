
public class OppositeCase {

	public static void main(String[] args) {
		char res[]=oppositeCase();
		for(int i=0;i<=res.length-1;i++)
		{
			System.out.print(res[i]);
		}
	}
	public static char[] oppositeCase()
	{
		String str="rAjArAmMoHaNrOy";
		str=str.concat("\0");
		char ch[]=str.toCharArray();
		int i=0;
		while(ch[i]!='\0')
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
		    
			}
			i++;
		}
		return ch;
	}
}
