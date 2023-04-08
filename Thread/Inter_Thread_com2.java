package April03InterThread;

//with wait(), notify(), notifyAll()
class Sync1{
	int i;
	boolean flag = false;
	synchronized void display(int i) {
		if(flag)
			try {
				wait();
			}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		this.i = i;
		flag = true;
		System.out.println("Data Displayed: "+i); 
		notify();
	}
	synchronized int receive() {
		if(!flag)
			try {
				wait();
			}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		System.out.println("Data recived: "+i);
		flag = false;
		notify();
		return i;
	}
}
class Thread11 extends Thread{
	Sync1 obj;
	Thread11(Sync1 obj){
		this.obj = obj;
	}
	public void run() {
		for (int j=1; j<=10; j++) {
			obj.display(j);
		}
	}
}
class Thread22 extends Thread{
	Sync1 obj;
	Thread22(Sync1 obj){
		this.obj = obj;
	}
	public void run() {
		for (int j=1; j<=10; j++) {
			obj.receive();
		}
	}
}		
public class Inter_Thread_com2 {
	public static void main(String[] args) {
		Sync1 obj = new Sync1();
		Thread11 t = new Thread11(obj);
		Thread22 t1 = new Thread22(obj);
		t.start();
		t1.start();
	}
}