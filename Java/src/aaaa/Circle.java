package aaaa;
import java.awt.Color;

public class Circle extends Shape     
{
   private int a_radius;             
   
   
   public Circle(int radius) throws IllegalArgumentException           
   {
      setRadius(radius);
   }

   
   public Circle(int radius, Color circleColor) throws IllegalArgumentException 
   {
      super(circleColor);                    
      setRadius(radius); 
   }

 
   public int getRadius()
   {
      return a_radius;
   }

  
   public void setRadius(int r) throws IllegalArgumentException
   {
      if (r >= 0)
      {
         a_radius = r; 
      }
      else
      {
         throw new IllegalArgumentException("Negative value for radius");
      }
   }

   
   public long getCircumference()    
   {
     return Math.round(2* Math.PI*a_radius);
   }


   public long getArea()             
   {
      System.out.println("\nNow calculating the area of a circle.");
      return Math.round(Math.PI*a_radius*a_radius);
   }
}
