package feb27;

public class DynamicBinding {
	void show() { // dynamic binding
		System.out.println("Is it clear");
	}}
class Binding  extends DynamicBinding  {
	void show () {
		System.out.println("overriden");
	}
	public static void main(String[] args) {
		DynamicBinding obj=new Binding();
		obj.show();
	}
	
	}