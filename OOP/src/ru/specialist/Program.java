package ru.specialist;

import ru.specialist.stuff.Person;
import ru.specialist.graph.*;

/*
	ru.specialist.graph
	Point
		x,y
		Point(int, int)
		draw()
		moveBy(int dx, int dy)
*/
public class Program {

	public static void main(String[] args) {
		{
			Person.showTotal();
			
			Person p1 = new Person("Сергей", 40);
			// p1.name = "Сергей";
			// p1.age = 40;

			Person p2 = new Person("Костя", 11);
			// p2.name = "Костя";
			// p2.age = 11;
			Person p3 = new Person("Саша");

			Person px = new Person();

			//p1.show(); // this == p1
			//p2.show(); // this == p2
			//p3.show();
			//px.show();
			
			Person.showTotal();
			Person.showAll();
		}
		{
			Point p1 = new Point(10, 20);
			p1.moveBy(2, 3);
			p1.draw();
			
			System.out.println( p1.toString() );
		}

	}

}
