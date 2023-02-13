package aaaa;
import java.awt.Color;

public class Triangle extends Shape             
{
   private int a_sideA;                       
   private int a_sideB;                         
   private double a_angle;  // Sharp angle of the sides in degrees (0-90)              
   
  
   public Triangle(int a, int b, double c) throws IllegalArgumentException    
   {	   
	  super(); 
      setSideA(a);
      setSideB(b);
      setAngle(c);
   }
   
    
   public Triangle(int a, int b, double c, Color color) throws IllegalArgumentException 
   {
      super(color);                            
      setSideA(a);
      setSideB(b);
      setAngle(c);
   }

   public int getSideA()
   {
      return a_sideA;
   }

   public void setSideA(int side) throws IllegalArgumentException
   {
      if (side >= 0)
      {
         a_sideA = side; 
      }
      else
      {
         throw new IllegalArgumentException("Negative value for side length");
      }
   }

   public int getSideB()
   {
      return a_sideB;
   }

   public void setSideB(int side) throws IllegalArgumentException
   {
      if (side >= 0)
      {
         a_sideB = side; 
      }
      else
      {
         throw new IllegalArgumentException("Negative value for side length");
      }
   }

   public double getAngle()
   {
      return a_angle;
   }

   public void setAngle(double angle) throws IllegalArgumentException
   {
      if (angle >= 0 && angle <= 90)
      {
         a_angle = angle; 
      }
      else
      {
         throw new IllegalArgumentException("Angle must be 0-90 degrees");
      }
   }

   public long getArea()
   {
      System.out.println("\nNow calculating the area of a triangle.");
      return Math.round(.5*a_sideA*a_sideB*Math.sin(Math.toRadians(a_angle)));
   }

   public long getCircumference()
   {
      double sideC = Math.sqrt( (a_sideA*a_sideA) + (a_sideB*a_sideB) - (2*a_sideA*a_sideB*Math.cos(Math.toRadians(a_angle))) );
      return Math.round(a_sideA+a_sideB+sideC);
   }

}
