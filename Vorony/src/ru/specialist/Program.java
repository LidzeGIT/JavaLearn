package ru.specialist;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Сколько ворон на ветке: ");
		int n = sc.nextInt();
		String v;
		int n2 = n%100;
		if ( n2 >= 11 && n2 <= 14)
			v = "ворон"; 
		else {
			switch(n%10) {
				case 1 : v = "ворона"; break;
				case 2 : 
				case 3 : 
				case 4 : v = "вороны"; break;
				default: v = "ворон"; break;
			}
		}
		
		System.out.printf("На ветке %d %s\n", n, v);
		
		

	}

}
