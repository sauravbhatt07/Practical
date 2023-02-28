package feb28;
interface ParentInterface  {
	void show(); // by default abstract method
}
class InterfaceEg1 implements ParentInterface { // class implemnts INterface
	
public void show () {
	System.out.println("parent Interface method");
}
public static void main(String[]args) {
	InterfaceEg1 object = new InterfaceEg1();
	object.show();
}}
