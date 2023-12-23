import java.util.*;
public class Point{
    private double x;
    private  double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double Distance(Point dest){
        double xDistance = dest.x - this.x;
        double yDistance = dest.y - this.y;

        return Math.sqrt(Math.pow(xDistance,2) + Math.pow(yDistance,2));
    }
}