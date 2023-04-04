package April04IO;
import java.io.FileInputStream;
//we can read all character- using FileInputStream
 class AllCharsFIS {
	public static void main(String[] args) {
		try {
	FileInputStream f = new FileInputStream("D:\\4.txt");
	int i = 0;
	while ((i=f.read())!=-1) {
		System.out.println((char)i);
	}
	f.close();
		}
	catch (Exception e) {
		System.out.println(e);
	}}}
