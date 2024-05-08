
public class LastIndexOf {

	public static void main(String[] args) {
		
int res=lastIndexOf('a');
System.out.println(res);
	}
public static int lastIndexOf(char c)
{
	String str="rajarammohanroy";
	char ch[]=str.toCharArray();
	int i=ch.length-1;
	while(ch[i]!=-1&& ch[i]!=c)
	{
		i--;
	}
	if(ch[i]==c)
	{
		return i;
	}
	else
	{
		return -1;
	}
}
}
