package feb24;
 class Finalmethod1 { //parent class
	final void display() { //create a final method
	System.out.println("This is a final method.");
	}}
	class Child extends Finalmethod1{ //child class name Main
// try to override finalmethod
//		public final void display() {
//			System.out.println("The Finalmethod is Overridden");
	}
public class Finalmethod{ //Main class
	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
	}}
		
