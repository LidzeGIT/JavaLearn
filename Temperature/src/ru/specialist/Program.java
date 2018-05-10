package ru.specialist;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// ÂÂÎÄ ÄÀÍÍÛÕ
		
		//Locale l = Locale.US; 
				//new Locale("ru", "ru");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("T (C): ");
		double tc = sc.nextDouble();
		
		// ÎÁĞÀÁÎÒÊÀ ÄÀÍÍÛÕ 
		double tf = tc * 9d / 5d + 32d;
		
		// ÂÛÂÎÄ ÄÀÍÍÛÕ
		System.out.printf(Locale.US, "T (F): %.2f\n", tf);
		
	}

}
