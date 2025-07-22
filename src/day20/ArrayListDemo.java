package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		ArrayList mylist= new ArrayList();
		//List mylist1= new ArrayList();
		//ArrayList <String>mylist2= new ArrayList<String>();
		
		//Add data in to array list
		mylist.add(100);
		mylist.add(10.45);
		mylist.add('A');
		mylist.add("welcome");
		mylist.add(false);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//Find the size of array list
		System.out.println(mylist.size());
		
		//Print the data in array list
		System.out.println("Print data in mylist:");
		System.out.println(mylist);
		
		//Remove data from array list
		mylist.remove(5);
		System.out.println("Print the exist data:");
		System.out.println(mylist);
		
		//Insert data into array list
		mylist.add(3,"java");
		System.out.println("List after inserting");
		System.out.println(mylist);
		
		//Modify element in array list
		mylist.set(3, "python");
		System.out.println("List after modifying data:");
		System.out.println(mylist);
		
		//Access specific element in array list
		System.out.println(mylist.get(4));
		
		//Reading all the elements in array list
		// 1. using normal for loop
		
		for (int i=0; i<mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}  System.out.println();
		
		//2. using advanced for loop
		
		for (Object x:mylist) {
			System.out.println(x);
		}
		System.out.println();
		
		//3. using Iterator
		
		Iterator it= mylist.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		} System.out.println();
		
		// checking array list empty or not
		
		System.out.println(mylist.isEmpty());
		
		// remove few elements for array list
		
		ArrayList mylist2= new ArrayList();
		
		mylist2.add(100);
		mylist2.add(10.45);
		mylist2.add('A');
		
		mylist.removeAll(mylist2);
		
		System.out.println(mylist);
		
		//remove all elements in array list
		
		mylist.clear();
		
		System.out.println(mylist);
		
		
		
		
		
		
		

	}

}
