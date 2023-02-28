package feb28;
//Inheritance with interface
interface Parent { // parent interface (interface inheritance interface with extends)
	void show();
}
interface child extends Parent { // child interface (interface inheritance interface with extends)
	void display();
}
class child1 implements child { // another child interface (interface inherit by class with implement)
	@Override
	public void show() {
		System.out.println("Parent interface method");
	}
	@Override
	public void display() {
		System.out.println("child interface method");
		
	}
	}
public class InheritanceInterface {
	public static void main(String[] args) {
		child1 obj=new child1();
		obj.show();
		obj.display();
	}
}