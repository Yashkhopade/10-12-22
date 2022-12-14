import java.util.Scanner;
public class WallPainting{
        public static void main(String[] args) {
    
        {
        int length, width, numberOfDoors, numberOfWindows;
        double height;
        
        Scanner a = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = a.nextInt();
 
        System.out.print("Enter width: ");
        width = a.nextInt();
        
        System.out.print("Enter height: ");
        height = a.nextDouble();
        
        System.out.print("Enter number of doors: ");
        numberOfDoors = a.nextInt();
        
        System.out.print("Enter number of windows: ");
        numberOfWindows = a.nextInt();

        double totalSurfaceArea = 2 * (length * width + length
                * height + width * height);

        int areaOfFloor = length * width;
        
        int areaOfDoors = 20 * numberOfDoors;
        
        int areaOfWindows = 15 * numberOfWindows;
        
        double totalPaintArea = totalSurfaceArea - areaOfFloor
                - areaOfDoors - areaOfWindows;
        
        double requiredPaint = totalPaintArea / 350;

        System.out.println("Paint required "
                + requiredPaint + " gallons.");
      }
      }
      }
       