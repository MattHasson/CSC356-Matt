import java.util.Scanner;

enum Shapes { CIRCLE, SQUARE, RECTANGLE, UNKNOWN };

public class ShapesApp 
{
   static final double PI = 3.14159;

   public static void main(String[] args) 
   {
			int width, length, radius;
			String userEntry;
			Shapes userShape;
			Scanner in = new Scanner(System.in);
      
			System.out.print("Please enter shape (circle, square, rectangle): ");
			userEntry = in.nextLine();

			userShape = getShape(userEntry);

      switch( userShape )
      {
         case CIRCLE:
				   System.out.print("\nPlease enter radius of circle: ");
					 radius = in.nextInt();
					 System.out.printf("\n%f\n", area(radius));
         break;
				 case SQUARE:
				   System.out.print("\nPlease enter side length: ");
					 length = in.nextInt();
					 System.out.printf("\n%d\n", area(length, length));
					 break;
				 case RECTANGLE:
				   System.out.print("\nPlease enter width: ");
					 width = in.nextInt();
				   System.out.print("\nPlease enter length: ");
					 length = in.nextInt();
					 System.out.printf("\n%d\n", area(width, length));
					 break;
         default:
            System.out.println( "Unknown Shape" );
						break;
      }
   }
   
   static Shapes getShape( String input )
   {
      if ( input.equalsIgnoreCase( "Circle" )) {
         return Shapes.CIRCLE;
      } else if (input.equalsIgnoreCase("Square")) {
				 return Shapes.SQUARE;
      } else if (input.equalsIgnoreCase("Rectangle")) {
				 return Shapes.RECTANGLE;
			} else {
				 return Shapes.UNKNOWN;
			}
   }
   
   static double area( int rad ) {
	   return rad*rad*PI;
   }
   
	 static int area (int length, int width) {
		return length * width;
	 }
}
