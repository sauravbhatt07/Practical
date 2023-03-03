package March03;
public class PassingArrayToMethod {
	// creating a method which pass an array as a parameters
		static void maximumNo(int array[]) {// method name maximumNo
			int max =array[0];
			for(int i=1;i< array.length;i++)
				if(max<array[i])
					max=array[i];
			System.out.println(max);
		}
		static void minmumNo(int array[]) {// method name maximumNo
			int min =array[0];
			for(int i=1;i< array.length;i++)
				if(min>array[i])
					min=array[i];
			System.out.println(min);
		}
		public static void main(String[] args) {
			// declaring & initializing array
			int a[]= {5,4,6,2,5};
			maximumNo(a); // passing array to method max
			minmumNo(a); // passing array to method minimum

		}
		}


