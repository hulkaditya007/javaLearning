package javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptionalClass<T> {
	

	public static <E> void main(String[] args) {
		
		OptionalClass oc = new OptionalClass();
		Map<String,String> df = new HashMap<>();
		df.put("Hello", "world");
		
		oc.optionalFunction(df);
		oc.optionalFunction(23);
		oc.optionalFunction("Hello World");
		
		List<E> list = new ArrayList<>();
		list.add(23);
		list.add("Hello");
		
	}
	
	public void optionalFunction(T val){
		System.out.println(val);
		
	}

}
