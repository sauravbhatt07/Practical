package March22Throw;

public class ThrowEg {
	// whether the student is pass or not
		public static void mydisplay(int a) throws ArithmeticException {
			if(a>=0 && a<35) {
				//throw Arithmetic exception if not then fail
				throw new ArithmeticException("you are fail");
			}
			else {
				System.out.println("you are passed!!");
			}}
			// main method
			public static void main(String[] args) {
				mydisplay(15);
				System.out.println("rest of the code...");
			}
		}