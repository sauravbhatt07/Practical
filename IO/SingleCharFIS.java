package April04IO;
import java.io.FileInputStream;
// we can read single character--- using FileInputStream
public class SingleCharFIS {
	public static void main(String[] args) {
	try {
FileInputStream f = new FileInputStream("D:\\3.txt");
		//read single character
int i = f.read();{
	System.out.println((char)i);
}
f.close();
	}
catch (Exception e) {
	System.out.println(e);
}}}
