package com.techlabs.model.crudoperation.test;

import java.util.TreeSet;

public class TreeTest {
	public static void main(String args[]) {
		TreeSet<String> fruits = new TreeSet<String>();

		// Add
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Banana");
		
		//Update
		if(fruits.contains("Mango"))
		{	fruits.remove("Mango");//Delete
		fruits.add("Chickoo");
		}
		
		//Read
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		//Search
		for (String fruit : fruits) {
			if (fruit.contains("Apple"))
				System.out.println(fruit);
		}
		
	}

}
