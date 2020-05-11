package StringProgram;

import java.util.Scanner;

public class StringEquals {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		String  value = s.next();
		
		Scanner s2 = new Scanner(System.in); 
		String  value2 = s2.next();
		
		String data="Priyanka";
		String data1="Priyanka";
		
		String str1=new String("Priyanka");
		String str2=new String("Priyanka");
		
		StringBuilder sc=new 	StringBuilder("Priyanka");
		StringBuffer sc1=new StringBuffer("Priyanka");
				
				
		boolean status= data== data1;
		boolean status2= value.equals(str1);
		System.out.println(status);
		System.out.println(status2);
		

	}

}
