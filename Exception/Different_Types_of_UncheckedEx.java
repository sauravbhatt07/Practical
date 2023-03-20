package March20Exception;

public class Different_Types_of_UncheckedEx {
	public void display() { // method
		// before try-catch block
		String a="i am error";
		System.out.println(a);
		try {
			int i=50/0; // arithmetic exception
			System.out.println(i);
			// null pointer exception
			String s= null;
			System.out.println(s.length()); 
			// arrayindexoutofbound exception
			int arr[]=new int[5];
			arr[7]=10;
			// number formate exception
			String s1="riya";
			int n=Integer.parseInt(s1);
			System.out.println(n);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//after try-catch block
		String b="THe end";
		System.out.println(b);
		//System.out.println(a+" "+b);// a am error + i can not hNDLWE
	}
	public static void main(String[] args) {
		Different_Types_of_UncheckedEx ep=new Different_Types_of_UncheckedEx();
		ep.display();
	}}