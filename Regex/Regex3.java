package March15regex;
import java.util.regex.Pattern;
public class Regex3 {
	public static void main(String[] args) {
		boolean b7 = Pattern.matches("[A-Za-z0-9+.@]{19}", "Pallabi.Anudip@2023"); // to add symbol enter + sign than type symbol to be added
		System.out.println(b7);
		boolean b8 = Pattern.matches("[A-Za-z0-9]{10,}", "Anudip123ppp"); 
		System.out.println(b8);
		// to print mobile no simple
		boolean b9 = Pattern.matches("[0-9]{10}","8285174568");
		System.out.println(b9);
		// to print mobile no 
		boolean b4 = Pattern.matches("[6789]{1}[0-9]{9}","8285174568");
		System.out.println(b4);

		// to print email id
		boolean b3 = Pattern.matches("[a-z0-9+_.-]*@[a-z]*+\\.[a-z]{3}","sauravbhatt0@gmail.com");
		System.out.println(b3);
		boolean b1 = Pattern.matches("\\w{9}","Anudip123");
		System.out.println(b1);
	
	}}