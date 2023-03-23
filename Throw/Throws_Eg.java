package March23Throws;
import java.io.IOException;
class Test {
void display()throws IOException{
	System.out.println("Throws exception perfectly");
}}
public class Throws_Eg{
	public static void main(String[] args) throws IOException{
	Test obj = new Test();
	obj.display();
	}}