package ru.specialist;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// ���� ������
		
		//Locale l = Locale.US; 
				//new Locale("ru", "ru");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("T (C): ");
		double tc = sc.nextDouble();
		
		// ��������� ������ 
		double tf = tc * 9d / 5d + 32d;
		
		// ����� ������
		System.out.printf(Locale.US, "T (F): %.2f\n", tf);
		
	}

}
