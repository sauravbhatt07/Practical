package March27Thread;
// creating thread by extending thread class
class ThreadExample extends Thread {
public void run() {
	System.out.println("I am thread .....thread is runninng");
}
public static void main(String[] args) {
	ThreadExample t = new ThreadExample();
	t.start(); //move the thread to the active state
t.setName("GOKU");
String s = t.getName();
System.out.println(s);
}
}
