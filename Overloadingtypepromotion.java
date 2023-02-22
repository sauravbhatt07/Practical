package feb22;
public class Overloadingtypepromotion {
	void add (int a,double b) { //method1
System.out.println(a+b);		
	}
void add (int a,int b,int c) { //method2
System.out.println(a+b+c);	
}
public static void main (String args[]) {
	Overloadingtypepromotion obj = new Overloadingtypepromotion(); //oobj
obj.add(2,3); //2nd int value (3) will be promoted to double
obj.add(10,20,30);
}}


