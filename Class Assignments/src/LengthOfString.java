
public class LengthOfString {

	public static void main(String[] args) {
		int res=length();
		
    System.out.println(res);
	}
public static int length() {
	int i=0;
	String str="RajaRamMohanRoy";
	str=str.concat("\0");
	char ch[]=str.toCharArray();
	while(ch[i]!='\0')
	{
		i++;
	}
	return i;
}
}
