package edu.gatech.oad.antlab.person;

import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  // Gee, I sure hope this works.
	  String out = "";
	  Random rng = new Random();
	  while (!input.isEmpty()) {
		int index = rng.nextInt(input.length());
		String letter = input.substring(index, index + 1);
		out = out + letter;
		input = input.substring(0, index) + input.substring(index + 1);
	  }
	  return out;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

	/**
	 * For testing purposes.
	 */
	public static void main(String[] args) {
		Person2 test = new Person2("Creston Bunch");
		System.out.println(test.toString("abcdefg"));
		System.out.println(test.toString("efghijk"));
		System.out.println(test.toString("lmnopqr"));
	}
}
