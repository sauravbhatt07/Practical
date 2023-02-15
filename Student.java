package Inheritance;
//Aggregation example
public class Student { // class 1
	int id;
	String name;
	Address address; // aggretion (entity ref of address class)
public Student (int id, Address address, String name) {
	this.id=id;
	this.name=name;
	this.address=address;
}
void display() { //method
	System.out.println(id+ " "+ name);
	System.out.println(address.city+" "+address.state+" "+address);
}
public static void main(String[] args) {
	Address address1 = new Address("SD","ND","India");
	Address address2 = new Address("09","UK","India");
	Student s=new Student (0707,address1,"Lucky");
	Student s1=new Student (10101,address1,"Dark");
s.display();
s1.display();
}
}

