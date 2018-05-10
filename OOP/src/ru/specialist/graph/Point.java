package ru.specialist.graph;

public class Point extends Shape{
	public int x;
	public int y;
	//String color;
	
	// static ArrayList<Point> scene
	// scene.add()
	// static void drawScene()
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int moveBy;
	
	public void moveBy(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	@Override
	public void draw() {
		//System.out.printf("Point (%d, %d). %s\n", x,y,color);
		super.draw();
		System.out.println( this );
	}
	
	
	
	@Override
	public String toString() {
		return String.format("Point (%d, %d). %s", x,y,super.color);
	}
	
	
	
	
	
	
	
	
	
	
	
}
