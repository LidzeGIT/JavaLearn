package ru.specialist;

public class Program {
	public static double average(int... m) {
		int summa = 0;
		for(int k : m)
			summa += k;
		
		return (double)summa / m.length;
		
	}
	
	public static double average(int a, int b) {
		//double avg = (a + b) / 2d;
		//return avg;
		return (a + b) / 2d;
	}

	public static void sayHello() {
		sayHello("����������");
	}
	public static void sayHello(int age) {
		System.out.printf("������, %d!\n", age);
	}
	public static void sayHello(String name) {
		System.out.printf("������, %s!\n", name);
	}
	public static void sayHello(String name, int age) {
		System.out.printf("������, %s - %d!\n", name, age);
	}
	
	
	public static void main(String[] args) {
		//Program p = new Program();
		Program.sayHello("������", 40);
		sayHello("�������");
		sayHello(30);
		sayHello();
		
		double x = average(10, 11);
		System.out.println(x);
		System.out.println( average(10, 11) );
		System.out.println();
		
		System.out.println( average(new int[] {10, 11, 12})  );
		System.out.println( average( 10, 11, 12, 13 )  );
		

	}

}
