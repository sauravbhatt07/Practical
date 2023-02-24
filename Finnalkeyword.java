package feb24;
//final keyword---
//final keyword -- cannot change thevalue of final variable
public class Finnalkeyword {
final int value = 50; //final variable
void display() {
	System.out.println(value);
// we can't change the value of final variable
// value = 70; --compile time error show
}
public static void main(String[] args) {
	Finnalkeyword fv = new Finnalkeyword();
	fv.display();
}
}


