package feb28;
//multiple interface-- we create multiple class/interface
interface Employee {
	void Salary1();
}
interface Devloper {
	void Bonus();
}
class Trainer implements Employee,Devloper{
	@Override
	public void Bonus() {
		System.out.println("Bonus will be 10% of salary");
	}
	@Override
	public void Salary1() {
		System.out.println("Salary increment");
	}}
		
public class MultipleInterface {
	public static void main(String[] args) {
		Trainer obj=new Trainer();
		obj.Bonus();
		obj.Salary1();
	}}


