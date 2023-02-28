package feb28;
interface New_Employee { // parent interface
	void Salary(); // abstract method salary for parent interface 1
}
interface New_Devloper { // parent interface 2
	void Salary(); // abstract method Bonus for parent interface 2
}
class New_Trainers implements New_Employee,New_Devloper{
	@Override
	public void Salary() {
		System.out.println("Salary increment");
	}}
	public class MultipleInterface2 {
	public static void main(String[] args) {
		Trainer obj=new Trainer();
		obj.Salary1();
		}}


