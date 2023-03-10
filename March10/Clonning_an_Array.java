package March10;

public class Clonning_an_Array {
	public static void main(String[] args) {
		int[]arr = {44,55,66,77,88};  // declaring and initialization
		System.out.println("print the actual array");
		for(int i:arr)  // for each loop for print
			System.out.println(i);  // print
		System.out.println("print the clone array");
		int carr[]=arr.clone();  // creating clone
		for(int i:carr)  // for each loop for cloning array
			System.out.println(i);
		System.out.println("both are equal or not?");
		System.out.println(arr==carr);  // checking
	}
}