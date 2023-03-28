package March28;
public class Sleep_MethodEg2 extends Thread {
	public void run() {

	    for(int i=0; i<=5; i++) {
			try {
				Thread.sleep(800);} // thread will be sleep 800 m,ili sec
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}}
	public static void main(String[] args) {
		 Sleep_MethodEg2 t=new   Sleep_MethodEg2();
		 Sleep_MethodEg2 t1=new   Sleep_MethodEg2();
		 t.start();
		 t1.start();

}}