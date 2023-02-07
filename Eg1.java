package Constructor;

public class Eg1 {
int age;
String name;
void show() {
	System.out.println(age+" "+name);}
public static void main(String[] args) {
Eg1 d = new Eg1();
Eg1 d1 = new Eg1();
d.show();
d1.show();
Eg1 d3 = new Eg1();
d3.age = 100;
d3.name = "Java" ;
System.out.println(d3.age+d3.name);
}
}
