package April07Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListUsingUserDefined {
public static void main(String[] args) {
Bank b = new Bank();
Bank b1 = new Bank(12354, "Kilbish", 6600.79, 20);
Bank b2 = new Bank (12344, "Nil", 8900.19, 18);
Bank b3 = new Bank(12334, "Null", 3810.99, 23);
Bank b4 = new Bank (12234, "Janny", 7460.9, 87);
Bank b5 = new Bank (11243, "Stock ", 8100.9, 40);
ArrayList<Bank> al = new ArrayList<Bank>();
al.add(b);
al.add(b1);
al.add(b2);
al.add(b3);
al.add(b4);
al.add(b5);
Iterator itr = al.iterator();
while(itr.hasNext()) {
Bank obj = (Bank)itr.next();
System.out.println(obj.AccountNo + " "+obj.CustomerName + " "+
obj.Balance + " "+obj.CustomerAge);
}
}
}
