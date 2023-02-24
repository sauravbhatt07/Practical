package feb24;
public class BlankFinalvariable {
	final int value; //blank initialliztion of final variable
	BlankFinalvariable(){ //default Contructor
		value = 70;
		System.out.println(value);
//we can't change the value of final variable
		// compile time error
	}
public static void main(String[] args) {
	BlankFinalvariable fv = new BlankFinalvariable ();	//create object
}}

