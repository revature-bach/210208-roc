package com.revature.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void demo() {
		System.out.println();
		System.out.println("==== MAP EXAMPLE ====");
		// HashMap v. HashTable
		// HashMap is not thread safe unlike HashTable
		// it's kind of like where we said StringBuilder was not thread safe, but StringBuffer was
		// HashMap is therefore faster than HashTable
		
		// Map is part of the Collections Framework, but is in a different hierarchy from the Collection interface
		Map<String, Long> phoneBook = new HashMap<>();
		
		phoneBook.put("Mom", 1111111111L);
		phoneBook.put("Dad", 1111111111L);
		phoneBook.put("Bob", 3333333333L);
		phoneBook.put(null, null);
		
		// duplicate keys are not possible
		// if you try to do, for example .put("Bob", ...) again, it will overwrite the original value
		System.out.println(phoneBook.get("Bob"));
		
		
		phoneBook.put("Bob", 4444444444L);
		System.out.println(phoneBook.get("Bob"));
		
		System.out.println(phoneBook.get(null));
		
		// HashMaps and HashTables do not preserve order. We are not guaranteed what order our elements will print out in
		System.out.println("===== Iterating over keys =====");
		Set<String> phoneBookKeys = phoneBook.keySet();
		for (String e : phoneBookKeys) {
			System.out.println(e);
		}
		
		System.out.println("===== Iterating over keys and values =====");
		Set<Map.Entry<String, Long>> keyValues = phoneBook.entrySet();
		for (Map.Entry<String, Long> e : keyValues) {
			System.out.println("key = " + e.getKey() + " : value = " + e.getValue());
		}
		
		System.out.println("===== Iterating over just values =====");
		Collection<Long> values = phoneBook.values();
		
		for (Long l : values) {
			System.out.println(l);
		}
	}
	
}
