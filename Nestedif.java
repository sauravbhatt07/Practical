class Nestedif {
public static void main (String[] args) { 
String address = "kolkata,India";

if(address.endsWith("India")) {//true

if(address.contains("Dunloop")) {//False
System.out.println("Your city is DUnloop");}

else  if(address.contains("Newtown")) {//False
System.out.println("Your city is Newtown");}

else {
System.out.println(address.split(",")[0]);
}
}

else {
System.out.println("You are not living in India");
}}}


