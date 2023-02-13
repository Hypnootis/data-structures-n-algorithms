package aaaa;
import java.awt.Color;

public class Parallelogram extends Shape
{
	private int a_side1;                        
	private int a_side2;
	private double a_angle; // Sivujen v�linen kulma asteina

	public Parallelogram(int s1, int s2, double angle) throws IllegalArgumentException               
	{
		setSide1(s1);
		setSide2(s2);
		setAngle(angle); 
	}

	public Parallelogram(int s1, int s2, double angle, Color c) throws IllegalArgumentException      
	{
		super(c);  
		setSide1(s1);
		setSide2(s2);
		setAngle(angle);      
	}

	public int getSide1()
	{
		return a_side1;
	}

	public void setSide1(int side) throws IllegalArgumentException
	{
		if (side >= 0)
		{
			a_side1 = side; 
		}
		else
		{
			throw new IllegalArgumentException("Negative value for side");
		}
	}

	public int getSide2()
	{
		return a_side2;
	}

	public void setSide2(int side) throws IllegalArgumentException
	{
		if (side >= 0)
		{
			a_side2 = side; 
		}
		else
		{
			throw new IllegalArgumentException("Negative value for side");
		}
	}

	public double getAngle()
	{
		return a_angle;
	}

	public void setAngle(double angle) throws IllegalArgumentException
	{
		if (angle >=0 && angle < 90)
		{
			a_angle=angle;
		}
		else
		{
			throw new IllegalArgumentException("Illegal value for angle");
		}
	}

	public long getArea()
	{
		System.out.println("\nNow calculating the area of a parallelogram.");
		double area = a_side1*a_side2*Math.sin(Math.toRadians(a_angle));
		return Math.round(area);
	}

	public long getCircumference()
	{
		return (2*a_side1) + (2*a_side2);
	}

}
