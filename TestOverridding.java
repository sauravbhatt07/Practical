package feb22;

 class TestOverridding {
	 void run () { //method 1
		 System.out.println("running mode");
	 }}
//creating child class
 class overriding extends TestOverridding {
//defining same name method as its declared in the parent class
	 void run () { //method 2
		 System.out.println("running mode off");
	 }
	 public static void main(String[] args) {
		//creating a object of child class
		 overriding a = new overriding();
		 a.run();
	}}

