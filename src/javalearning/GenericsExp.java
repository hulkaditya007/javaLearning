package javalearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


//Genric Class
public class GenericsExp<T> {
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
    //Print Array
	public static <E> void printArray(E[] elements) {
		
		for(E element: elements) {
			System.out.println(element);
		}
	}
	
	//Print List
	public static void printList(List<?> elements) {
		for(Object element: elements) {
			System.out.println(element);
		}
	}
	//Upper bound wildcard--> read allowed write not allowed
	public static void printListType(List<? extends Number> list) {
		for(Object element: list) {
			System.out.println(element);
			
		}
	}
	//Lower bound wildcard--> write allowed read only for object allowed
	public static void printListIntType(List<? super Integer> list) {
		 for (int i = 1; i <= 5; i++) {
	            list.add(i);
	        }
	}
	
	
	public static <K,V> HashMap<K,V> createMap(K[] keys, V[] values) {
		HashMap<K,V> resultMap = new HashMap<>();
		if(keys.length == values.length) {
			for(int i=0;i<keys.length;i++) {
				resultMap.put(keys[i], values[i]);
			}
		}
		return resultMap;
		
	}

	public static void main(String[] args) {
		
		//Generic Class Objects
		GenericsExp<String> ge1 = new GenericsExp<>();
		GenericsExp<Integer> ge2 = new GenericsExp<>();
		ge1.setValue("Hello World");
		ge2.setValue(23);
		
		System.out.println(ge1.getValue());
		System.out.println(ge2.getValue());
		
		String[] arrString = {"A1","B1","C1"};
		Integer[] arrInteger = {1,2,3};
		Float[] arrFloat = {1.0f,2.34f,23.56f};
		Double[] arrDouble = {1.23,2.34,45.67};
		Short[] arrShort = {8,4,5};
		
		System.out.println("-----Print Arrays Using Genrics-----");
		printArray(arrString);
		printArray(arrInteger);
		
		System.out.println("-----Print Lists Using Genrics-----");
		printList(Arrays.asList(arrString));
		printList(Arrays.asList(arrInteger));
		
		
		System.out.println("-----Print Map Using Genrics-----");
		Map<Integer,String> map = new HashMap<>();
		map = createMap(arrInteger,arrString);
		
		for(Entry<Integer, String> entry: map.entrySet()) {
			System.out.println("Key="+entry.getKey() + "  value="+entry.getValue());
		}
		
		System.out.println("Wildcard Upperbound");
		System.out.println("For Integer");
		printListType(Arrays.asList(arrInteger));
		System.out.println("For Float");
		printListType(Arrays.asList(arrFloat));
		System.out.println("For Double");
		printListType(Arrays.asList(arrDouble));
		
		//UpperBound will give error incase of string if we pass string list to printListType method.
		
		
		System.out.println("Wildcard Lowerbound");
		List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
		System.out.println("For Integer");
		printListIntType(numberList);
		printListIntType(objectList);
		
		System.out.println("Number List: " + numberList);
        System.out.println("Object List: " + objectList);
		
		
		
		
		
	}

}



