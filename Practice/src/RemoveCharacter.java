import java.util.Scanner;
public class RemoveCharacter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=s.nextLine();
		System.out.println("Enter the string to be removed:");
		String str=s.nextLine();
		s1=s1.replaceAll(str,"");
		System.out.println("New string is :" +s1);
		
	}
}
