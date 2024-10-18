package javalearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ParentClass1 {

	public static void main(String... args) {
		int it = Integer.valueOf("321");
		Integer it2 = Integer.sum(23, 34);
		System.out.println(it2);
		System.out.println(Integer.toBinaryString(it));
		/*
		 * Map<Integer,String> map = new HashMap<>(); map.put(1, "ABC"); map.put(2,
		 * "ABCD");
		 * 
		 * for(Integer key:map.keySet()) { System.out.println(key); }
		 * 
		 * for(Integer key:map.keySet()) { System.out.println(map.get(key)); }
		 * 
		 * for(Entry<Integer, String> x:map.entrySet()) {
		 * System.out.println(x.getValue() +"----------"+x.getKey()); }
		 */
	}
}
