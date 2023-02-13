package Inheritance;
class MLParenteg2{ //parent class
	int salary = 30000; // parentclass member
}
 class MIChildEg2 extends MLParenteg2 {
	int bonous = 1500; //child class member
	int annualsal =  salary + bonous;
		}
	public class MIChildEg1 extends MIChildEg2{
		int da = 200;
		int totalsal = annualsal + da;
		public static void main(String[] args){
			MIChildEg1 object = new MIChildEg1();
			System.out.println("Salary is:" + object.salary);
			System.out.println("Annual Salary is:" + object.annualsal);
			System.out.println("Total Salary is:" + object.totalsal);
		}}
