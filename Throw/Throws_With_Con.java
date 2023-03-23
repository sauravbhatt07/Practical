package March23Throws;

public class Throws_With_Con {
String name;
int age;
public Throws_With_Con(String name,int age)throws Exception {
if (age<18) {
	throw new Exception("Age should be more than 18");
}
this.name=name;
this.age=age;
}
public static void main(String[] args)throws Exception  {
	Throws_With_Con obj = new Throws_With_Con("Saurav",23);
	System.out.println(obj.name+" "+obj.age);
	
}
}
