package feb23lab;
class Exam { //parent class
	int marks() { // mark is a method of parent class
		return 0;
	}}
class comp extends Exam{ //child class 1 comp
	int marks() { //same name method as per parent 
		return 80;
	}}
class math extends Exam { // child class 2 math
	int marks() {
		return 70;
	}}
class science extends Exam{ //child class 3
	int marks() {
		return 50;
	}}
class eng  extends Exam{ // child class 4
	int marks() {
	return 90;
	}}
class Overridingeg{ //main class
	public static void main(String[] args) {
	Exam exam; //parent class refrence point
	exam = new science();
	System.out.println(	exam.marks());
	exam = new eng();
	System.out.println(	exam.marks());
	}}	
	