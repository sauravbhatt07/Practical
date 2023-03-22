package March22Exception;

public class ThrowTest {
	public static void checkknum(int num) {
		if(num<0) {
			throw  new ArithmeticException("Numbber is Negative");
		}
		else {
			System.out.println("Number is Positive");
		}
	}
public static void main(String[] args) {
	checkknum(-1);
	System.out.println("excuted");
}
}
