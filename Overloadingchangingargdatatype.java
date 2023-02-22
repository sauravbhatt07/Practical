package feb22;

public class Overloadingchangingargdatatype {
	static int sum(int a,int b) {
		return a+b;
	}
	//double type arguments
	static double sum (double a, double b) {
		return a+b;
	}
	public static void main(String[] args) {
System.out.println(Overloadingchangingargdatatype.sum(5,6));
System.out.println(Overloadingchangingargdatatype.sum(5.5,6.5));
	}}	
	


