package Inheritance;
public class MultilevelInheritance{
public static void main (String[]args) {
SIChild2 child = new SIChild2(); // create an object
child.display();
child.show();
child.print();
	}
	}
 class SIParent1 { //parent class
void show() { //parent class user defined method
System.out.println("Show the details");
}
}
//child class of SIPArent & parent class of SIChild2		 
class SIChild1 extends SIParent1{ //child class
void display() { //child class user defined method
System.out.println("Display the result");
}
}
class SIChild2 extends SIChild1{ //child class
void print() { //child class user defined method
System.out.println("Print the output");
}
}
			



