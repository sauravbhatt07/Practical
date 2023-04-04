package April04IO;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOS {
public static void main(String[] args) {
			try {
		FileOutputStream f = new FileOutputStream("D:\\5.text");
		BufferedOutputStream b = new BufferedOutputStream(f);
		String s = "Welcome to Coding Word";
		byte b1[] = s.getBytes();
		f.write(b1); 
		b.flush();
		f.close();
		b.close();
		System.out.println("Done");
			}
		catch (Exception e) {
			System.out.println(e);
			}
		}
		}
