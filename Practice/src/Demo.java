import java.util.Scanner;

class Demo {
  public static void main(String[] args) {

    System.out.println("Enter number till when fibonacci series you want");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int st=0,nd=1;
    for(int i=1;i<=n;i++)
    {
    	System.out.print(st+" ");
    	int nxt=st+nd;
    	st=nd;
    	nd=nxt;
    }
    
  }
}