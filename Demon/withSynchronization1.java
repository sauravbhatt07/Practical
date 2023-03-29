package March29Demon;

/// with/without synchronization
class MyThreadClass{
	// void print(int num) {// without synchronization
	synchronized void print(int num) {//with synchronization method
		for(int i=0; i<=5; i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(500);}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Thread1 extends Thread{
	MyThreadClass Mt;
	Thread1(MyThreadClass Mt){
		this.Mt=Mt;
	}
	
	public void run() {
		Mt.print(5);}}
class Thread2 extends Thread{
	MyThreadClass Mt;
	Thread2(MyThreadClass Mt){
		this.Mt=Mt;
	}
	public void run() {
		Mt.print(2);
	}
}
public class withSynchronization1 {
	public static void main(String[] args) {
		MyThreadClass obj=new MyThreadClass();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();
	}

}