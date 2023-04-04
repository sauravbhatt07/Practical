package April04IO;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteArrayOS {
	public static void main(String[] args) throws IOException {
		//Write byte to string
		FileOutputStream f=new FileOutputStream("D:\\7.txt");
		FileOutputStream f1=new FileOutputStream("D:\\8.txt");
				ByteArrayOutputStream bout =new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(f);
		bout.writeTo(f1);
		bout.flush();
		bout.close();
		System.out.println("done");
}
}