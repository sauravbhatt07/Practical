package Inheritance;
 class SIParent {//parent class
	void show() {//parent class user defined method
		System.out.println("Show the details");
	}}
		class SIChild extends SIParent{//child class
			void display() {//child class user ddefined method
				System.out.println("Display the result");
			}}
			public class Singleinheritance{
			public static void main (String[]args) {
				SIChild child = new SIChild(); // create an object
				child.display();
				child.show();
			}
			}
	

