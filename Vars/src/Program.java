
//import java.util.Date;
//import java.util.ArrayList;
import java.util.*;
// import java.sql.*;


/**
 * 
 * @author student
 * @deprecated Use class Main
 */
public class Program {

	public static final double PI = 3.1415;
	private static int z;
	public static final int q = z;
	
	int k;

	public static void main(String[] args) {
		{
			//java.util.Date now = new java.util.Date();
			Date now = new Date();
			ArrayList l;
			Program p;
			
		}

		{
			int k = 10;
			System.out.println(k);
		}

		{
			String k = "abc";
			System.out.println(k);
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		{
			int a, c;
			a = 10;

			Integer pa = 10; // boxing
			int q = pa; // unboxing

			byte b1 = 10;
			int h = b1; // implicit conv

			double d;
			Double d1;

			String s = null;

			Object o = new Object();
			Object o2 = o;

			int b = 10 + 1; // init var
			int x = 5, y = 8;

			System.out.println(a);
			z = z + 1;
			System.out.println(z);

			// a = a + 5;
			a += 5;

			System.out.println(a);
			System.out.println(b);
		}
		{
			int a = 123;
			long l = a; // implicit conv
			
		
			int b = (int)l; // explicit conv
			
			int x = 1;
			l = Integer.MAX_VALUE  + (long)x;
			//l = Integer.MAX_VALUE  + 1L;
			// + - * / %
			// (5 + 3) * 4
			b = 5 / 2;
			
			//a = 0x1F;
			//a = 040;
			
			System.out.println(a);
			System.out.println(l);
			System.out.println(b);
			
		}
		{
			double d = 2d;
			d = 2e-8; //
			float  f = 1.5f;
			// + - * /
		}
		{
			int a = 5;
			//double b = a / 2d;
			int c = 2;
			double b = (double)a / c;
			
			System.out.println(b);
		}
		{
			char ch = 'A';
			ch = '\u005F'; // utf-16
			System.out.println( ch );
		}
		{
			boolean a = true;
			boolean b = false;
			
			// кнцхвеяйне х
			boolean c = a && b;
			// кнцхвеяйне хкх
			c = a || b;
			// кнцхвеяйне ме
			c = !a;
			c = a && !b;
			c = !(a && b); // !a || !b
			
			c = a || !b;
			
			int n = 10;
			
			c = (n - 5) == (n / 2);
			// !=
			// >
			// <
			// >=
			// <=
			
			n = 30;
			c = (n >= 0) && (n <= 100);
			
			System.out.println( c );
			
		}
		{
			int a;
			int b = (a = 5);
		}
		{
			int n = 10;
			//n = n + 1;
			//n += 1;
			int m = ++n + ++n + n++; // bad
			System.out.printf("n = %d\nm = %d\n", n, m);
		}
		{
			int a = 5; // 0101
			int b = 7; // 0111
			
			int c = a & b; // 0101
			c = a | b; // 0111
			c = ~a;
			c = a ^ b; // 0010
			
			c = a << 2; // 0101 << 2 = 010100
			a = -5;
			c = a >> 2; // 0101 >> 2 = 0001
			c = a >>> 2;
			a = 5; // 0101
			int bit2 = (a >> 1) & 1;
			
			
			System.out.println(c);
			
		}
		{
			final int x = 5;
			final int k = x+1;
			
		}

	}

}
