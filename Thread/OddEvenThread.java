package March27Thread;

public class OddEvenThread extends Thread {
	public void run() {
		System.out.println("Odd numbers b/w 1 to 100 :");
		for (int i=1; i<=100; i++) { // to take integer between 1 and 100
			if (i%2 !=0) { //logic for odd numbers
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Even numbers b/w 1 to 100 :");
		for (int j=1; j<=100; j++) { // to take integer between 1 and 100
			if (j%2==0) { // logic for even numbers
				System.out.print(j+" ");
			}
		}
	}
	public static void main(String[] args) {
		OddEvenThread ta =new OddEvenThread(); //creating object 
		
		ta.start(); // starting method extended from Thread class
	}

}