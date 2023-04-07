package April07Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

 class ArrayListUsingIterator {
public static void main(String[] args) {
ArrayList<String> al = new ArrayList<String>();
al.add("Rose");
al.add("Sunflower");
al.add("Lily");
al.add("Daisy");
al.add("Marigold");
al.add("Tulip");
al.add("Jasmine");
al.add("Orchid");
al.add("Lotus");
al.add("Lavender");
System.out.println("traversing using for loop");
for(int i = 0;i<al.size();i++) {
System.out.println(al.get(i));
}
System.out.println("traversing using for each loop");
for (String a:al) {
System.out.println(a);
}
System.out.println("traversing using for Iterator");
Iterator itr = al. iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}
System.out.println("traversing using for Iterator-forward");
ListIterator<String> itr1 = al.listIterator();
while(itr1.hasNext()) {
System.out.println(itr1.next());
}
System.out.println("traversing using for Iterator-Backward");
ListIterator<String> itr2 = al.listIterator(al.size());
while(itr2.hasPrevious()) {
System.out.println(itr2.previous());
}
System.out.println("traversing using forEach()method");
al.forEach(a->System.out.println(a));
}}