
public class StringSplit2 {

	public static void main(String[] args) {
		String s1="Sachin is the best player";
		String s2[]=s1.split(" ");
		String str="";
		for(int i=0; i<s2.length;i++)
		{
			char ch[]=s2[i].toCharArray();
			
			for(int j=ch.length-1;j>=0;j--)
			{
				str+=ch[j];
			}
			str+=" ";
		}
		System.out.print(str);
	}

}
