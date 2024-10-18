package javalearning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountAlphabets {

	public static void main(String[] args) {
		String s = "Hello";
		s = s.toLowerCase();
		char[] str = s.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c :str) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		List<String> l = Arrays.asList(s);
		
		Map<Character, Long> out = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(out);
	}
	


}
