package Inheritance;
class SIParenteg1{//parent class
	int salary = 30000; // parent class member
}
public class SingleInheritanceEg1 extends SIParenteg1{
int bonous = 1500;
int annualsal = salary+bonous;
public static void main(String[] args) {
	SingleInheritanceEg1 object = new SingleInheritanceEg1();
	System.out.println("Salary is:" + object.salary);
	System.out.println("Annual Salary is:" + object.annualsal );
}}


