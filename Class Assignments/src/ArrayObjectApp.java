
public class ArrayObjectApp {

	public static void main(String[] args) {
		
		ArrayObject [] person=new ArrayObject[5];
        
		ArrayObject man1=new ArrayObject("Sachin",45,101);
		ArrayObject man2=new ArrayObject("Saurav",55,102);
		ArrayObject man3=new ArrayObject("Rahul",50,103);
		ArrayObject man4=new ArrayObject("Dhoni",43,104);
		ArrayObject man5=new ArrayObject("Virat",38,105);
		person[0]=man1;
		person[1]=man2;
		person[2]=man3;
		person[3]=man4;
		person[4]=man5;
		for(int i=0;i<person.length;i++)
		{
		System.out.println(person[i].name);
		System.out.println(person[i].age);
		System.out.println(person[i].id);
		}
		
	}

}
