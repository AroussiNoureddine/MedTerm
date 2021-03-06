package datastructure;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> l= new ArrayList<>();
		l.add("ABC");
		l.add("BCD");
		l.add("BGR");
		for (String list:l) {
			System.out.println(list);
		}
		l.remove("ABC");

		System.out.println("after removing the first eliment ");
		Iterator iter = l.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
