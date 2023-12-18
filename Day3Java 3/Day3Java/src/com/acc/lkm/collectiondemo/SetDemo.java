package com.acc.lkm.collectiondemo;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		//Creating HashSet and storing elements
		LinkedHashSet<String>hashSet=new LinkedHashSet<>();
		hashSet.add("Spring");
		hashSet.add("Hibernate");
		hashSet.add("SpringBoot");
		hashSet.add("MicroServices");
		hashSet.add("REST API");
		hashSet.add(null);
		hashSet.add("Spring");
		System.out.println(hashSet);
		LinkedHashSet<String>hashSet2=new LinkedHashSet<>();
		hashSet2.add("BDC");
		hashSet2.add("KDC");
		hashSet.addAll(hashSet2);
		System.out.println(hashSet);
		hashSet.remove(null);
		System.out.println(hashSet);

	}

}
