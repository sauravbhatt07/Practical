package April17Mapin;
import java.util.HashMap;
import java.util.Map;
class HashMapEG {
public static void main(String[] args) {
	///creating map
HashMap<Integer,String> map = new HashMap<Integer,String>();
map.put(101,"Mango");
map.put(108,"Orange");
map.put(105,"Banana");
map.put(103,null);
map.put(null,null);
map.put(102,null);
map.put(101,"Apple");
//traversing
for(Map.Entry m : map.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
}}}
