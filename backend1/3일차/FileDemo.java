import java.io.FileReader;

public class FileDemo {

	public static void main(String[] args) throws Exception {
		String filepath = "F:/2.수원아카데미/6.2022_12_10개강_오후반2/20230128_start/src/test.txt";
		FileReader reader = new FileReader(filepath);
		int ch = 0;
		while( (ch = reader.read()) !=-1 ) 
		{
			System.out.print((char)ch);
		}	

	}

}
