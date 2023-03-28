package March27Thread;

class ThreadExmple2 extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(800);}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			}}//System.out.println(Thread.currentThread().getName());
	public static void main(String[] args) {
		ThreadExmple2 t=new ThreadExmple2();
		ThreadExmple2 t1=new ThreadExmple2();
		ThreadExmple2 t2=new ThreadExmple2();
		/*t.run();
		t1.run();
		t2.run();
	}}*/
		t.start();
		try {
			t.join();		
		} 
		catch (InterruptedException e) {
			System.out.println(e);
		}
		t1.start();
		try {
			t1.join();		
		} 
		catch (InterruptedException e) {
			System.out.println(e);
		}
		t2.start();
		try {
			t2.join();		
		} 
		catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}