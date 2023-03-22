package March22Exception;
public class Finally_Block {
	public static void main(String[] args) {
		// exception not occur
		try {
			int a =4/2;
			System.out.println(a);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		// exception occurs 
		try {
			int a = 4/0;
			System.out.println(a);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		// exception occure but not balanced
		try {
			int a = 4/0;
			System.out.println(a);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Always finally block will execute");
		}
	}

}