package feb27;
//understand type= 1. variable type
//2. reference type--
//class bank
//psvm(String []args)
//baamk.obj
//object type-- bank obj=new bank();


//static binding(private,final,static)
public class StaticBinding {
	private void display() {
		System.out.println("Something");}
	public static void main(String[] args) {
		StaticBinding obj=new StaticBinding();
		obj.display();
	}
	}