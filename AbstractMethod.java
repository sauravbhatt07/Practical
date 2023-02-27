package feb27;

abstract class Testabstract { // abstract class -- parent class
	abstract void display(); // abstract method
	// non aBSTRACT METHOD
	 void show () {
		 System.out.println(" Non abstract method invoked");
	 }}
class Demo1 extends Testabstract { // 1st child class
	// abstract method of parent class
	void display() {
		System.out.println("Demo1 method invoked");
	}}
class Demo2 extends Testabstract { // 2st child class
	// abstract method of parent class
	void display() {
		System.out.println("Demo2 method invoked");
	 }
public class AbstractMethod {
	public static void main(String[] args) {
		Demo1 child1=new Demo1();
		Demo2 child2=new Demo2();
		child1.display();
		child2.display();
		child2.show();
	}
}
}