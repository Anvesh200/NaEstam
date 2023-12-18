package com.acc.lkm.collectiondemo;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String>arrayList=new ArrayList<String>();
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("SFDC");
		arrayList.add("SAP");
		/*Iterator iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		/*for(String str:arrayList) {
			System.out.println(str);
		}*/
		arrayList.add(2,"Oracle");
		System.out.println(arrayList);
		System.out.println("Market");
		ArrayList<String>arrayList2=new ArrayList<>();
		arrayList2.add("Europe");
		arrayList2.add("Functions");
		arrayList2.add("Growth");
		arrayList.addAll(arrayList2);
		System.out.println(arrayList);
		arrayList.remove(1);
		System.out.println(arrayList);
		arrayList.removeIf(str->str.contains("SAP"));
		System.out.println(arrayList);
		arrayList.removeAll(arrayList2);
		System.out.println(arrayList);
		System.out.println(arrayList2);

	}

}
