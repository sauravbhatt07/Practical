package Partice;

public class Feb3eg1 {
	public static void main(String[] args) {
		int a = (101 + 0)/3;
		System.out.println("(101 + 0)/3 -> "+(a));
		double b = 3.0e-6*10000000.1;
		boolean x = true && true;
		boolean y = false && true;
		boolean z = (false && false) || (true && true);
		boolean m = (false && false) || (true && true);
		System.out.println("3.0e-6*10000000.1-> "+(b));
		System.out.println(" -> "+ x);
		System.out.println(" -> "+ y);
		System.out.println("(false && false) || (true && true) -> "+ z);
		System.out.println("(false && false)||(true && true) -> "+ m);
	}

}
