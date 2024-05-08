
public class Substring {

	public static void main(String[] args) {
	char res[]=substring(7,12);
	for(int i=0;i<res.length;i++)
	{
		System.out.print(res[i]);
	}

	}
public static char[] substring(int start,int end)
{
	String s="RajaRamMohanRoy";
	s=s.concat("\0");
	char ch1[]=s.toCharArray();
	char ch2[]=new char[ch1.length];
	int i=start;
	int j=0;
	while(i<=end-1)
	{
		ch2[j]=ch1[i];
		i++;
		j++;
	}
	return ch2;
}
}
