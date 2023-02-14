package Inheritance;
//Aggregation example
class AggregationEg { // class1
	int Squre (int r) { //method name square
		return r*r;
	}}
class circle{ //class 2
	AggregationEg ag; // obj(entity ref)
	double pi = 3.14;
	double area (int radius) {
		ag = new AggregationEg();
		int psqure = ag.Squre(radius);
		return pi*psqure;
	}
public static void main(String[] args) {
	circle c = new circle();
	double result = c.area(5);
	System.out.println(result);
}}

