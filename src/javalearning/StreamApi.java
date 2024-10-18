package javalearning;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

	private static int x1 = 10;
	private static String finalString = "";

	public static void main(String[] args) {

		Map<String, Integer> count = new HashMap<>();
		List<Integer> li = new ArrayList<>();
		li.c

		Mul e = new Mul();
		List<String> list1 = Arrays.asList("SHYAM", "RAM", "GHANSHYAM");
		
		list1.stream().map(p->p.toLowerCase()).forEach(System.out::println);
		
		List<Integer> it = Arrays.asList(5,2,8,3,4);

		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"),
				Arrays.asList("e", "f"));
		
		List<String> list2= list1.stream().sorted().collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer> list3= it.stream().sorted().collect(Collectors.toList());
		System.out.println(list3);

		// Filter DEMO->
		list1.stream().filter(name -> name.contains("H")).forEach(System.out::println);

		// Map DEMO->
		list1.stream().map(name -> name.length()).forEach(System.out::println);

		// MAP calling function
		list1.stream().map(name -> lengthMul100(name)).forEach(System.out::println);

		// MAP with class method
		list1.stream().map(name -> e.lengthMul200(name)).forEach(System.out::println);

		// MAP with global variable
		list1.stream().map(name -> name + "" + x1).forEach(System.out::println);

		// MAP and FILTER
		List<String> nameFilteredMap = list1.stream().filter(name -> name.contains("H"))
				.map(name -> name.concat(" SHARMA")).collect(Collectors.toList());
		nameFilteredMap.forEach(System.out::println);

		// Count no of characters in string
		list1.stream().map(name -> fullString(name)).map(name -> countalpa(name)).forEach(System.out::println);
		System.out.println(finalString);
		System.out.println(countalpa2(finalString));

		// FLATMAP
		List<String> flatList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		flatList.forEach(System.out::println);

		Optional<String> nonEmptyOptional = Optional.of("Hello");
		Optional<String> emptyOptional = Optional.empty();

		// Check if value is present
		if (nonEmptyOptional.isPresent()) {
			System.out.println(nonEmptyOptional.get()); // Output: Hello
		}

		// Provide a default value if empty
		System.out.println(emptyOptional.orElse("Default Value")); // Output: Default Value

		// Execute a lambda expression if value is present
		nonEmptyOptional.ifPresent(System.out::println); // Output: Hello
		
		//Even-ODD
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		integers.stream().map(i-> i%2 ==0 ? i+" even" : i+" odd").forEach(System.out::println);
		
		String s1= "Aditya";
		String s2 ="Drishti";
		
		System.out.println(IntStream(s1.concat(s2)).distinct());
	}

	static Map<Character, Long> countalpa2(String name) {

		return name.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	}

	static String countalpa(String name) {
		System.out.println(name);
		return name;
	}

	static String fullString(String name) {
		finalString = finalString.concat(name);
		return finalString;
	}

	static int lengthMul100(String name) {
		return name.length() * 100;
	}
}

class Mul {

	int lengthMul200(String name) {
		return name.length() * 200;
	}
}