package April03InterThread;

class A{
	int i;
	synchronized void display(int i) {
		this.i = i;
		System.out.println("Data displayed: "+i);
	}
	synchronized int receive() {
		System.out.println("Data recieved: "+i);
		return i;
	}
}
class Thread1 extends Thread{
	A obj;
	Thread1(A obj){
		this.obj = obj;
	}
	public void run() {
		for (int j=1; j<=10; j++) {
			obj.display(j);
		}
	}
}
class Thread2 extends Thread{
	A obj;
	Thread2(A obj){
		this.obj = obj;
	}
	public void run() {
		for (int j=1; j<=10; j++) {
			obj.receive();
		}
	}
}
public class Inter_Thread_Com {
	public static void main(String[] args) {
		A obj = new A();
		Thread1 t = new Thread1(obj);
		Thread2 t1 = new Thread2(obj);
		t.start();
		t1.start();
	}
}