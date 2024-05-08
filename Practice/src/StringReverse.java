import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter your name");
   String str=scan.nextLine();
  String reverse="";
   for(int i=str.length()-1;i>=0;i--)
   {
	   reverse=reverse+str.charAt(i);
   }
   System.out.println("The reverse name is:" +reverse);
   
	}

}
