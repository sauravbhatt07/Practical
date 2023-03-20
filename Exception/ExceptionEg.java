package March20Exception;
public class ExceptionEg {
	public void display() { // method
		String a="i am error";
		System.out.println(a);
		try {
			int i=50/0; // arithmetic exception
			System.out.println(i);
			// after exception can't excute the other line
			String s ="riya";
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//after try-catch block
		String b="i cannot not handle";
		System.out.println(a+" "+b);// a am error + i can not hNDLWE
	}
	public static void main(String[] args) {
		ExceptionEg ep=new ExceptionEg();
		ep.display();
	}}