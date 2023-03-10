package March10;

public class CopyArray {
	public static void main(String[] args) {
		// declaring a source array
		char[]coopyfrom = {'d','e','f','g','h','i','j','k'};
		// declaring a destination array
		char[]copyTo = new char[7];  // new array
		System.arraycopy(coopyfrom, 1, copyTo, 1, 4);
		// print the destination array
		System.out.println(String.copyValueOf(copyTo));
	}
}