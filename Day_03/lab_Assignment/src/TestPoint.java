import com.dkte.*;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter X and Y for Point 1:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

      
        System.out.println("Enter X and Y for Point 2:");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();


        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

      
        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

    
        if (p1.isEqual(p2)) {
            System.out.println("Points are the same.");
        } else {
            System.out.println("Points are different.");
            System.out.printf("Distance between points: %.4f\n", p1.calculateDistance(p2));
        }

        sc.close();
    }
}
