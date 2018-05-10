package ru.specialist;

public class Program {

	public static void main(String[] args) {
		
		for(int i=0; i < 10; i++ ) {
			if (i == 3) continue;
			if (i == 7) break;
			
			System.out.println(i);
		}
		
		for(int i=100; i > 0; i -= 3 )  
			System.out.println(i);
		
		// 1 2 3 4 ... 10
		// 2 4 6 8 ... 20
		//
		//
		
		
		metka:
		for(int i=1; i <= 10; i++) {
			// вывод одной строки
			for(int j=1; j <= 10; j++) {
				if (j == 5) break metka;
				System.out.printf("%4d", i*j);
			}
			System.out.println();
		}
		
		System.out.println("continue");
		
		int a = 2000;
		while (a < 1000) {
			System.out.println(a);
			a *= 2; // a = a * 2
		}
		
		a = 2;
		do {
			System.out.println(a);
		} while ( (a *= 2) < 1000);
		// 0 1 1 2 3 5 8 13 21 ...
		
		
		int k1 = 0;
		int k2 = 1;
		
		int k;
		System.out.println(k1);
		System.out.println(k2);
		
		while ( (k = k1 + k2) < 1000 ) {
			System.out.println(k);
			k1 = k2;
			k2 = k;
		}
		
		
		
		
		
		

	}

}
