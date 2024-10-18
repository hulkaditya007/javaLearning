package javalearning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentIterator {

	public static void main(String args[]) {

		ConcurrentHashMap<Integer, String> con = new ConcurrentHashMap<>();

		con.put(1, "Adi");
		con.put(2, "Dris");

		int k = 0;

		for (Map.Entry<Integer, String> i : con.entrySet()) {
			System.out.println(i.getKey() + "  " + i.getValue());
			k++;
			if (k == 1) {
				con.put(3, "Drishya");
			}
		}

		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

		List<Integer> valuesToAdd = Arrays.asList(1, 2, 3, 4, 5);
		list.addAll(valuesToAdd);
		
		int n = 0;
		for(int i=0;i<list.size();i++) {
			n++;
			if (n == 1) {
				list.add(90);
			}
			System.out.println(list.get(i));
		}
	}
}
