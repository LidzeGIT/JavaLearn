package ru.specialist;

public class Program {

	public static void main(String[] args) {
		int a = -10;
		if (a > 0) {
			System.out.println("a > 0");
			System.out.println("a ������ 0");
		} 
		else { 
			if (a > -100)
				System.out.println("a ������ -100");
			else
				System.out.println("a �� ������ 0");
		}
		
		int n = 0;
		/*String s;
		if (n == 0)
			s = "����";
		else
			s = "�� ����";*/
		
		String s = (n == 0) ? "����" : "�� ����";
		
		final int x = -1;
		
		switch(x) {
			case -1: 
			case x+2: 
				System.out.println("����");
				break; // return
			case 2: 
				System.out.println("���");
				break;
			case 3: 
				System.out.println("���");
				break;
			default:
				System.out.println("�����");
		}
		
		// �� ����� 5 �����
		
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
