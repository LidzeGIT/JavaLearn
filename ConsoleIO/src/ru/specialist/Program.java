package ru.specialist;

import java.util.Date;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		System.out.print("Hello");
		System.out.println("World");
		
		/*BufferedReader reader = 
			new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("Введите ваше имя: ");
		String userName = reader.readLine();
		
		// Integer.parseInt(String)
		// Double.parseDouble(String)
		System.out.print("Введите ваш возраст: ");
		int age = Integer.parseInt(reader.readLine());*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите ваше имя: ");
		String userName = sc.nextLine();
		
		System.out.print("Введите ваш возраст: ");
		int age = sc.nextInt();
		
		// tc * 9 / 5 + 32
				
				
		// Привет, Сергей - 40!
		System.out.printf("Привет, %2$d - %1$s!\n", userName, age);
		String result = 
				String.format("Привет, %-20s - 0x%x!", userName, age);
		System.out.println(result);
		
		System.out.printf("pi = %10.3f\n", Math.PI);
		
		Date now = new Date();
		
		// 2018-04-11
		System.out.printf("%tY-%tm-%td\n", now, now, now);
		System.out.printf("%1$tY-%1$tm-%1$td\n", now);
		System.out.printf("%tY-%<tm-%<td\n", now);
		System.out.printf("%tF\n", now);
		System.out.printf("%tR\n", now);
		
		double radius = 5;
		
		double length = 2*Math.PI*radius;
		double square = Math.PI*radius*radius;
		
		System.out.printf("Окружность радиуса: %.2f\nДлина: %.2f\nПлощадь: %.2f", 
				radius, length, square);
		
		
		

	}

}
