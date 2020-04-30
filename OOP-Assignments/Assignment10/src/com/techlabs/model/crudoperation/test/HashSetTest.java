package com.techlabs.model.crudoperation.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String args[]) {
		HashSet<String> fruits = new HashSet();

		// Add operation
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Banana");

		// Read Operation
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		// Delete OPeration
		fruits.remove("Mango");

		// Search
		for (String fruit : fruits) {
			if (fruit.contains("Apple"))
				System.out.println(fruit);
		}

		// update
		for (String fruit : fruits) {
			if (fruit.equals("Apple")) {
				fruits.remove("Apple");
				fruits.add("Chickoo");
				break;
			}
		}
		System.out.println("after modify");
		for (String fruit : fruits) {

			System.out.println(fruit);
		}

	}

}
