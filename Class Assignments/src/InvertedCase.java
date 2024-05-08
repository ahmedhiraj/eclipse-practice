import java.util.Scanner;
public class InvertedCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		String s="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				s+=(char)(ch+32);
			}
			else if(ch>=97 && ch<=122)
			{
				s+=(char)(ch-32);
			}
			else
			{
				s+=ch;
			}
		}
		System.out.println("Inverted String is:" +s);

	}

}
