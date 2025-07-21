package day18;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a[]= new int [5];
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter position:");
		
		int x=input.nextInt();
		
		System.out.println("Enter value:");
		
		int y=input.nextInt();
		
		try {
			a[x] =y;
			System.out.println(a[x]);
		} catch (ArrayIndexOutOfBoundsException s) {
			System.out.println("Invalid position");
		}
		
		
		
	    
		
		

	}

}
