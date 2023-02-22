package feb22;

public class OverloadingChangingArgs {
	static int sum (int a,int b) { //two parameters/arguments
	return a+b;
	}
	static int sum (int x,int y,int z) { //three parameters/arguments
	return x+y+z;
	}
	public static void main(String[] args) {
	System.out.println(OverloadingChangingArgs.sum(5,6));	
	System.out.println(OverloadingChangingArgs.sum(2,6,2));	
	}
	}


