package ru.specialist;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String s = "\\my\" \n\tstring\u004F";
		String hello = "Привет";
		String name = "Сергей";
		
		String r = hello + " " + name + "!";
		
		System.out.println( r );
		System.out.println( r.length() );
		System.out.println( r.isEmpty() );
		System.out.println( r.length() == 0 );
		System.out.println( r.charAt(0) );
		System.out.println( r.charAt(r.length()-1) );
		String empty = "     "; 
		System.out.println( empty.trim().isEmpty() );
		System.out.println( r.contains("Сергей") );
		System.out.println( r.contains("Андрей") );
		System.out.println( r.indexOf("Сергей") );
		System.out.println( r.toUpperCase() );
		System.out.println( r.substring(7, 13) );
		System.out.println( r );
		r = r.replace("Сергей", "Андрей");
		System.out.println( r );
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i <= 100; i++)
			sb.append(i).append(" ");
		
		String result = sb.toString();
				
		// "1 2 3 4 "
		// VERY BAD
		//String result = "";
		//for(int i=1; i <= 100; i++)
		//	result += String.valueOf(i) + " ";
		
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		
		String y = "y";
		final String x = y;
		String s1 = "Serge" + x;
		String s2 = "Sergey";
		
		//System.out.println( s1 == s2 );
		System.out.println( s1.equals(s2) );
		
		String tel = "232-12-45"; // xxx-xx-xx
		System.out.println(tel.matches("\\d{3}-\\d{2}-\\d{2}"));
		
		
		
		
		

	}

}
