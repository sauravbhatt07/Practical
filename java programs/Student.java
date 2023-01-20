class Student1 {       //  define a student class 
int slno;              // defining field/ data member/ Instance variable
String name; 
}


class Student{

public static void main (String...args){      // method of student class

Student1 s = new Student1 (); // creating a object

s.slno= 01;
s.name ="Saurav";



System.out.println (s.slno);
System.out.println (s.name);


s.slno= 02;
s.name ="Raja";

System.out.println (s.slno);
System.out.println (s.name);
}
}