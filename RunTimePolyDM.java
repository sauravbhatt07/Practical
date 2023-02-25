package feb24;
//runtime polymorphism ant achieved by data type member
public class RunTimePolyDM {
public static void main(String[] args) {
papa_mamma object;
object = new children();
System.out.println(object.Priority);
}
}
class papa_mamma{ //base class
	String Priority = "High";
}
class children extends papa_mamma{ // child class
	String Priority = "Super High";			
}
