package March06MultidimensionalArray;

public class Matrix03Add {
		public static void main(String[] args) {
		 int a[][]= {{1,2,3},{4,5,6},{7,8,9}}; // matrix 1
		 int b[][]= {{1,2,3},{4,5,6},{7,8,9}}; // matrix 2
		// create new matrix for storing result(addition) 	
			int c[][]=new int [3][3];
		// logic for printing row and column	
				for (int i=0;i<3;i++) { // for printing row
				for (int j=0;j<3;j++) { // for printing column
		// logic for matrix sum			
			c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+"  ");
				}	
			System.out.println();
		}}}
		


