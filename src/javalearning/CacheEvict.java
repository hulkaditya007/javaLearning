package javalearning;

import java.util.ArrayList;
import java.util.List;

public class CacheEvict {

	public static void main(String[] args) {
		List<String> cache = new ArrayList<>();
		List<String> cache2 = new ArrayList<>();
		cache2.add("A");
		cache2.add("B");
		cache2.add("C");
		cache2.add("D");
		cache2.add("C");
		cache2.add("B");
		int threshold = 3;
		
		/*
		 * ABC BCD BDE
		 * 
		 * bcd 
		 */
		int indexToRemove = 0;
		for(int i=0;i<cache2.size();i++) {
				if( cache.size()<=threshold && cache.contains(cache2.get(i))) {
					int id = cache.indexOf(cache2.get(i));
					if(id==0) {
						indexToRemove
					}
					else
					{
						cache.remove(0);
					}
				}
				else {
					if(cache.size()>0)
					{
						cache.remove(0);
					}
					cache.add(cache2.get(i));
				}
			}
		}
		
		System.out.println(cache);
		

	}

}
