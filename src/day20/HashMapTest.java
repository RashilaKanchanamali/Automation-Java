package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> x = new HashMap<Integer,String>();
		
		x.put(50,"A1");
		x.put(51,"A2");
		x.put(52,"A3");
		x.put(53,"A4");
		x.put(54,"A5");
		x.put(55,"A6");
		
		System.out.println(x.entrySet());
		System.out.println(x);
		
		System.out.println(x.keySet());
		System.out.println(x.values());
		
		Iterator <Entry<Integer,String>> y= x.entrySet().iterator();
		
		while (y.hasNext()) {
			Entry<Integer,String> z=y.next();
			System.out.println(z.getKey()+"   "+z.getValue());
		}

	}

}
