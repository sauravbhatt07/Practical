package feb24;
//Runtime polymorphism-- Dynamic method Dispatch
//overload a static method in java - compile time poly
//overrideen method called by the reference variable of papa class
// overriedden method is resolve at runtime rather then compile time
public class RunTimePoly{
	public static void main(String[] args) {
		java_student js; // reference variable  of parent class
		js=new Sana();
		System.out.println("quallity of sana is:"+js.quality());
		js=new Hemant();
		System.out.println("quallity of Hemant is:"+js.quality());
	}}
class java_student { // parent class
	String quality () {
		return null;
	}}
class Ritu extends java_student { // // child class 2
	String quality() { // overriddeen method
		return "Artists";
	}}
class Hemant extends java_student {// // child class 3
	String quality() { // overrideen method
		return "Active";
	}}
class Sana extends java_student { // // child class  4
	String quality() {
		return "Good_IN_Nature";
	}}
class Prince extends java_student {// // child class 5
	String quality() {
		return "Unable to run code";
	}}

