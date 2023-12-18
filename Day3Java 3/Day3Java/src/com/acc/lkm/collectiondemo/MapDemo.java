package com.acc.lkm.collectiondemo;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String>map=new LinkedHashMap<Integer,String>();
		map.put(12, "Java");
		map.put(13, "SAP");
		map.put(14, "SFDC");
		map.put(14, "Azure");
		map.put(null, "Hybris");
		map.put(15, null);
		map.put(16, null);
		/*for(Map.Entry m1:map.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}*/
		System.out.println(map);
		map.remove(null);
		System.out.println(map);
		map.replace(16, "AWS");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		/*map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);*/

	}

}
