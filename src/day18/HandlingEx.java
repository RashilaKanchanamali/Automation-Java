package day18;

import java.util.Scanner;

public class HandlingEx {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter value: ");
		int num= sc.nextInt();
		
		try{
			System.out.println(100/num);
			
		} catch(ArithmeticException a){
			System.out.println("Invalid value");
			
		}
		

	}

}
