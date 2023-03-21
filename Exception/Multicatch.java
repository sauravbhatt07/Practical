package Marcch21Exception;

public class Multicatch {
	static void run() { 
		try {
			// 1st code
			int i =50/0;
			System.out.println(i);
			// 2nd code
			int arr[] = new int[3];
			arr[4] = 34;		
		}
		catch(ArithmeticException a) { // will occur if the 1st code has error and will not execute 2nd   
			System.out.println("Only first airthmetic exception will occur.");
		}
		catch(ArrayIndexOutOfBoundsException ae) { // will only occur if the 1st code is error free
			System.out.println("Now array index out of bound will occur.");
		}
		// finally will must occur it does not depend upon error 
		finally { // finally block will occur either their is error or error free
			System.out.println("This is a finally block");
		}}
		public static void main(String[] args){
		run();
	}}
