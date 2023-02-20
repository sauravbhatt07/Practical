package feb20;
//super keyword --  reference variable which refer immediate parent class (IV,method ,con)
//3 usage of super keyword
//2--- refer immediate parent class instance variable

class Shape1{ //parent class
	void print() {//parent class method
		System.out.println("print Circle");
	}}
class Size1 extends Shape1{ //child class
	void print() {//same method of parent class(child class method))
		System.out.println("print triangle");
	}
	void display() { // new method of child class
		System.out.println("print nothing");
	}
	void show(){ //final method
	super.print();//refer immediate parent method
	display();
	print();
	}}
	 class SuperMethod  {
		 public static void main(String[] args) {
			Size1 obj = new Size1();
			obj.show();
		}}



