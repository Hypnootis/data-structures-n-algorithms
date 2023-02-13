package aaaa;
import java.awt.Color;

public abstract class Shape                 
{                                           
   private static int a_numberOfShapes=0;   
                                            
                                            
   private Color a_color;                   
                                            

   public Shape()                           
   {    
      this(Color.BLACK);   
      //Shape.a_numberOfShapes++;        
      //a_color = Color.BLACK;
   }

   public Shape(Color c)                    
   {                                        
      Shape.a_numberOfShapes++;        
      a_color = c;
   }

   
   public static int getNumberOfShapes()
   {
	   return a_numberOfShapes;
   }
   
   public Color getColor()
   {
	   return a_color;
   }

   public void setColor(Color c)
   {
       a_color = c;
   }
   
   public abstract long getArea();          
                                            
                                            
   public abstract long getCircumference(); 
                                          
}
