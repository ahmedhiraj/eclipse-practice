
public class IndexFinding {

	public static void main(String[] args) {
	int res=indexOf('r');
	System.out.println(res);

	}
public static int indexOf(char c)
{
	String str="rajarammohanroy";
	str=str.concat("\0");
	char ch[]=str.toCharArray();
	int i=0;
	while(ch[i]!='\0' && ch[i]!=c)
	{
		i++;
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
