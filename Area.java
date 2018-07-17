package myfirstproject;

public class Area {

	public double findArea(Circle c)
	{
		return Math.PI*c.radius*c.radius;
	}
	
	public double findArea(Square s)
	{
		return s.side*s.side;
	}
	
	public double findArea(Triangle t)
	{
		return 0.5*t.base*t.height;
	}
	
	public static void main(String[] args) {
		
		Circle c=new Circle();
		
		Square s=new Square();
		
		Triangle t=new Triangle();
		
		Area a=new Area();
		
		System.out.print("The area of the Circle is " + a.findArea(c));
		System.out.println();
		System.out.print("Thre area of the Square is " + a.findArea(s));
		System.out.println();
		System.out.println("The area of the triangle is " + a.findArea(t));
		
	}
	
}

class Circle{
	
	double radius=12.5;
}

class Square{
	
	double side=10.4;
	
}

class Triangle{
	
	double base= 15.2;
	double height=5.6;
	
}