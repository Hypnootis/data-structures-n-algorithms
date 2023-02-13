package aaaa;
import java.awt.Color;

public class Test
{
	private Circle c; 
	private Rectangle r;
	private Triangle t;
	private Parallelogram p;
	
	public Test()
	{
		int radius=5;    
	
		try
		{
			c = new Circle(radius, new Color(10,50,220));  
			c.setRadius(7);
			printAreaAndCircumference(c);
			printColor(c);

			r = new Rectangle(7,5, new Color(120,170,150));   
			printAreaAndCircumference(r);  
			printColor(r);

			t = new Triangle(17,7,60);  
			printAreaAndCircumference(t);
			printColor(t);

			p = new Parallelogram (20, 50, 20);  
			printAreaAndCircumference(p);
			printColor(p);
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("\nThe number of shapes is "+Shape.getNumberOfShapes());  
	}

	private void printAreaAndCircumference(Shape shape)
	{
		System.out.println("The area of the shape is "+shape.getArea());
		System.out.println("The circumference of the shape is "+shape.getCircumference());
	}

	private void printColor(Shape s)
	{
		System.out.println("The color of the shape is "+s.getColor().toString());
	}

	public static void main(String args[])
	{    
		Test test = new Test();
	}
}

