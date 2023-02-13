package aaaa;
import java.awt.Color;

public class Rectangle extends Shape            
{
   private int a_width;                        
   private int a_height;
   
   
   public Rectangle(int w, int h) throws IllegalArgumentException               
   {
      setWidth(w);
      setHeight(h);
   }

   
   public Rectangle(int w, int h, Color c) throws IllegalArgumentException      
   {
      super(c);                                
      setWidth(w);
      setHeight(h);
   }

   public int getWidth()
   {
      return a_width;
   }

   public void setWidth(int width) throws IllegalArgumentException
   {
      if (width >= 0)
      {
         a_width = width; 
      }
      else
      {
         throw new IllegalArgumentException("Negative value for width");
      }
   }

   public int getHeight()
   {
      return a_height;
   }

   public void setHeight(int height) throws IllegalArgumentException
   {
      if (height >= 0)
      {
         a_height = height; 
      }
      else
      {
         throw new IllegalArgumentException("Negative value for height");
      }
   }

   public long getArea()
   {
      System.out.println("\nNow calculating the area of a reactangle.");
      return a_width * a_height;
   }

   public long getCircumference()
   {
      return (2*a_width) + (2*a_height);
   }

}
