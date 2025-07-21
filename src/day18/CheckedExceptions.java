package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		
		Thread.sleep(5000);
		
		//FileInputStream f= new FileInputStream("C:// Text.txt");
		
		System.out.println("Statement 3");
		System.out.println("Statement 4");

	}

}
