package March29Demon;

public class  Demon  extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("i am demon");
		}else {
			System.out.println("I am user");
		}
	}
	public static void main(String[] args) {
		 Demon  t=new  Demon ();
		 Demon  t1=new Demon ();
		 Demon  t2=new Demon ();
		t.setDaemon(true);
		t2.setDaemon(true);
		t.start();
		t1.start();
		t2.start();
	}}

