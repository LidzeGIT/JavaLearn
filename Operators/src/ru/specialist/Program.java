package ru.specialist;

public class Program {

	public static void main(String[] args) {
		int a = -10;
		if (a > 0) {
			System.out.println("a > 0");
			System.out.println("a больше 0");
		} 
		else { 
			if (a > -100)
				System.out.println("a больше -100");
			else
				System.out.println("a НЕ больше 0");
		}
		
		int n = 0;
		/*String s;
		if (n == 0)
			s = "ноль";
		else
			s = "не ноль";*/
		
		String s = (n == 0) ? "ноль" : "не ноль";
		
		final int x = -1;
		
		switch(x) {
			case -1: 
			case x+2: 
				System.out.println("один");
				break; // return
			case 2: 
				System.out.println("два");
				break;
			case 3: 
				System.out.println("три");
				break;
			default:
				System.out.println("много");
		}
		
		// На ветке 5 ворон
		
		int z = 16;
		
		boolean r = (-z & z) == z; 
				//(z & (z-1)) == 0;
		
		//  00000..1..00000
		//  00000..0..11111
		//  000..1..000..10
		//  000..1..000..01
		
		System.out.printf("%d : %b\n", z, r);
		
		
		
		
		
		
		

	}

}
