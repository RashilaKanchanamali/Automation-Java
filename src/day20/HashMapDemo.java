package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap <Integer,String>hm= new HashMap<Integer,String>();
		
		//Add pairs
		hm.put(11, "AB");
		hm.put(12, "AC");
		hm.put(13, "AD");
		hm.put(14, "AE");
		hm.put(15, "AF");
		
		System.out.println(hm);
		
		//size of hashmap
		
		System.out.println(hm.size());
		
		//remove pair
		
		hm.remove(12);
		System.out.println(hm);
		
		//access particular pair
		
		System.out.println(hm.get(13));
		
		//get keys only
		
		System.out.println(hm.keySet());
		
		//get values only
		
		System.out.println(hm.values());
		
		//get key and value both
		
		System.out.println(hm.entrySet());
		System.out.println();
		
		//Reading pairs using for each loop
		
		for (int k: hm.keySet()){
			System.out.println(k+"   "+hm.get(k));
		}
		System.out.println();
		
		//Using iterator
		
		Iterator <Entry<Integer,String>> it=hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		//clear hash map
		hm.clear();
		System.out.println(hm.entrySet());
	}

}
