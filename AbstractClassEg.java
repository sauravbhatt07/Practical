package feb27;
abstract class Parentabs {
	Parentabs(){ //cons
		System.out.println("No-args Cons");
	}
abstract void show(); //abstract method
void run() {
	System.out.println("No abstracr method");
}
}
class Childabs extends Parentabs{
		@Override
		void show() {
		System.out.println("method body");
	}
}
class AbstractClassEg{
	public static void main(String[] args) {
	Parentabs object = new Childabs();
	object.show();
	object.run();
}}
