package com.acc.lkm.collectiondemo;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer>treeSet=new TreeSet<>();
		treeSet.add(100);
		treeSet.add(50);
		treeSet.add(200);
		System.out.println(treeSet);
		NavigableSet<Integer>navigableSet=treeSet.descendingSet();
		Iterator<Integer>iterator=navigableSet.iterator();
		for(Integer in:navigableSet) {
			System.out.println(in);
		}
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());

	}

}
