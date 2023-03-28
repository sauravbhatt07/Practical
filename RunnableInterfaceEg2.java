package March28;
//thread (runnable obj,String name)
public class RunnableInterfaceEg2 implements Runnable{
public void run() {
	System.out.println("Thread running");
}
public static void main(String[] args) {
// creating object of RunnableInterfaceEg2
	Runnable ri = new RunnableInterfaceEg2();
// creating object of thread class using thread(runnable ref var,String name)
Thread t =new Thread (ri,"Tom");
t.start();
String s = t.getName();
System.out.println(s);
}
}
