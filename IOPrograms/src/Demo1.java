import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		String path1="D:\\IOProg\\input.txt";
		String path2="D:\\IOProg\\output.txt";
		FileReader fr=new FileReader(path1);
		int temp;
		FileWriter fw=new FileWriter(path2);
		while((temp=fr.read())!=-1)
		{
			fw.write(temp);
            System.err.println(fw);
		}
		fw.flush();
	}

}
