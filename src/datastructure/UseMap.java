package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String,String> pCode = new HashMap<String,String>(); pCode.put("US",
				"New York"); pCode.put("UK", "London"); pCode.put("UAE", "Dubai");
				for (Map.Entry<String,String> country : pCode.entrySet()) {
			System.out.println(country.getKey()+"\t"+country.getValue()); }



		List<String> USA= new LinkedList<String>();
		USA.add("NY");USA.add("CL");USA.add("FL");
		List<String> UAE = new ArrayList<String>();
		UAE.add("Dubai");UAE.add("AbuDabi");UAE.add("Cahrga");

		Map<String, List<String>> map =new LinkedHashMap<String, List<String>>();
		map.put("USA", USA);map.put("UAE", UAE);

		for (Map.Entry<String,List<String>> entry : map.entrySet())
		System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

	}

}
