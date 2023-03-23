package March23Throws;
class  InvalidAgeException extends Exception{ //constructor
	public InvalidAgeException(String str) { //call the constructor of parent exception
		super(str);
	}
}
public class Custom_Except {
	static void checkage(int age ) throws InvalidAgeException{
if (age<25) {
	throw new InvalidAgeException("Not eligoible for java course");
}
else {
	System.out.println("java course registred sucessfully");
}}
	public static void main(String[] args) {
		try {
			checkage(23);
	}
		catch (InvalidAgeException e) {
			System.out.println(e);
}}}
	