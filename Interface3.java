package feb28;

interface ParentInterface1 {
	void show(); // by default abstract method
	default void print() {
		System.out.println("Default Method");
	}
	static void display() {
		System.out.println("static method");
	}
}
class IntefaceEg2 implements ParentInterface1 { // class implement interface
	@Override
	public void show() {
		System.out.println("parent interface method");
	}
}
	public class Interface3 {
	public static void main(String[] args) {
		IntefaceEg2 obj=new IntefaceEg2();
		obj.show();
		obj.print();
		ParentInterface1.display();
		
	}
	}