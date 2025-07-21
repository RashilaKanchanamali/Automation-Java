package day17;

public class DataConversionMethods {
	
	public static void main(String[] args) {
		
		//String to primitive data type
		String s1="10";
		String s2="20";
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		String s3="false";
		System.out.println(Boolean.parseBoolean(s3));
		
		//Primitive data into String type
		
		int a=10;
		double b=10.5;
		boolean c=false;
		char d= 'K';
		
		String S= String.valueOf(a);
		System.out.println(S);
		
		S=String.valueOf(b);
		System.out.println(S);
		
		S=String.valueOf(c);
		System.out.println(S);
		
		S=String.valueOf(d);
		System.out.println(S);
		
		 
		
	}

}
