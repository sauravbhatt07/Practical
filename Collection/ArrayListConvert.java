package April07Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Taken");
	al.add("GTA");
	al.add("Contra");
	al.add("WWE");
	al.add("Cricket");
	al.add("Football");
//convertion of list to array
	System.out.println("List to Array");
//toArray()method used to covert list to array
String[]arr=al.toArray(new String[al.size()]);
for(String s:arr) { //traversing using for each
System.out.println(s);
}
//array to list
System.out.println("Array to List");
List<String> all = new ArrayList<String>();
all =Arrays.asList(arr);
System.out.println(all);
}
}