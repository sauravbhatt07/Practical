package April17Mapin;
import java.util.LinkedHashMap;
import java.util.Map;

class LinkedHashMapEg {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		map1.put(101,  "Mango");
		map1.put(108,  "Orange");
		map1.put(105,  "Banana");
		map1.put(103,  "null");
		map1.put(null,  null);
		map1.put(102,  null);
		map1.put(null,  "Apple");
		map1.put(109,  "Litchi");
		System.out.println(map1);
		for (Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("-----------------------------------------------------");
		map1.putIfAbsent(102, "CustardApple");
		map1.putIfAbsent(101, "Watermelon");
		for (Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}  // Key
		System.out.println("keys: "+map1.keySet());
		//  Value
		System.out.println("Values: "+map1.values());
		// Key - Value
		System.out.println("Keys & values: "+map1.entrySet());
		map1.remove(103);
		System.out.println("After Removal");
		for (Map.Entry m : map1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}						
	}
}