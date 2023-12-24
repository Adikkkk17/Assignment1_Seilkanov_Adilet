import model.Point;
import model.Shape;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/adiletseilkanov/IdeaProjects/Assignment1_Seilkanov_Adilet/src/source");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        Point firstPoint = null, previousPoint = null;

        while (sc.hasNext()) {
            double x = sc.nextDouble(), y = sc.nextDouble();
            Point point = new Point(x, y);
            shape.addPoint(point);

            if (previousPoint != null) {
                double distance = previousPoint.distance(point);
                System.out.println("Distance between " + previousPoint + " and " + point + " = " + distance);
            } else {
                firstPoint = point;
            }

            previousPoint = point;
        }

        if (previousPoint != null && firstPoint != null) {
            double distance = previousPoint.distance(firstPoint);
            System.out.println("Distance between " + previousPoint + " and " + firstPoint + " = " + distance);
        }

        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Average side: " + shape.getAverageSide());
        System.out.println("Longest side: " + shape.getLongestSide());
    }
}
