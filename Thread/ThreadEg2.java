package March27Thread;
// directly we use thread class without extend
// With &Without set name we can name the thread
public class ThreadEg2 {
	public void run() {
		System.out.println("JOnny");
	}
	public static void main(String[] args) {
// creating an object of the thread class using the thread constructor
Thread t = new Thread ("Jerry");
Thread t1 = new Thread();
//ThreadEg2 obj = new ThreadEg2();
//obj.run();
t.start();
t1.start();
t1.setName("CN");
System.out.println("Thread 0:" + t.getName());
System.out.println("Thread 1:" + t1.getName());
	}}