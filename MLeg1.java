package Inheritance;
public class MLeg1 {
		public static void main(String[] args) {
			Child6 object= new Child6();
			System.out.println("Salary is : "+object.salary);
			System.out.println("Annual salary is : "+object.annualsal);
			System.out.println("Total salary is : "+object.totalsal);
			}
			}
		class SIParent4 { // parent class
			int salary=30000; // parent class member/variable
		}
		 // main class
		class Child8 extends SIParent4 { // child class
			int bonus=2500; // child class member/variable 
			int annualsal=salary+bonus;
			}
		class  Child6 extends Child8 {
		 	int hra=2500;
			int totalsal=annualsal+hra;
		}