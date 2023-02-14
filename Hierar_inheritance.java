package Inheritance;
class Employee{
	int  salary = 10000;
	int bonous = 1500;
	void action() {
		int updated_salary= salary + bonous;
		System.out.println(updated_salary);
	}}
class Engineer extends Employee{
	int Benefits = 10;
}
class Doctor extends Employee{
	int da = 5;
}
public class Hierar_inheritance {
	public static void main(String[] args) {
		Engineer e = new Engineer();
		System.out.println(e.salary+e.Benefits+"Updated salary for Enginner");
		e.action();
		Doctor d = new Doctor();
		System.out.println(d.salary+" "+"incremneted salary for Doctor");
		d.action();
	}}
	