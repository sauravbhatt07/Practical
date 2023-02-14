package Inheritance;
class Vehicle1{ //parent class A
	void running () {
		System.out.println("Running mode on");
	}}
class Car1 extends Vehicle1 { //child class 1
	void run () {
		System.out.println("Car run mode on");
	}}
class Bike1 extends Vehicle1{ //child class 2
	void speed () {
		System.out.println("Speed is very high");
	}}
public class HierarchicalInheritance {
public static void main(String[] args) {
	Bike1 b =new Bike1();
	b.running();
	b.speed();
	Car1 c = new Car1();
	c.running();
	c.run();
}}
	


