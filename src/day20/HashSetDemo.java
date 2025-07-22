package day20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet st= new HashSet();
		//Set stt= new HashSet();
		
		
		//add values
		st.add(100);
		st.add('A');
		st.add("Happy");
		st.add(null);
		st.add(true);
		
		System.out.println(st);
		
		//remove element
		st.remove("Happy");
		System.out.println(st);
		
		//read all the data one by one using for each loop
		
		for (Object x:st) {
			System.out.println(x);
		} 
		System.out.println();
		
		// using iterator
		
		Iterator it=st.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// clear data
		
		st.clear();
		
		System.out.println(st);
		
	}

}
