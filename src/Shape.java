import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> shape;
    public Shape(){
        shape = new ArrayList<>();
    }
    public void addPoint(Point point){
        shape.add(point);
    }
    public double calcPerimeter(){
        double perimeter = 0;
//calculate perimeter
        for (int i = 0; i < shape.size(); i++) {
            Point cPoint = shape.get(i);
            Point nPoint = shape.get((i + 1) % shape.size());

            perimeter += cPoint.Distance(nPoint);

        }
        return perimeter;
    }
//AverageSide
    public double getAverageSide(){
        double allLength = 0;

        for (int i = 0; i < shape.size(); i++) {
            Point cPoint = shape.get(i);
            Point nPoint = shape.get((i + 1) % shape.size());
            allLength += cPoint.Distance(nPoint);
        }
        return allLength % shape.size();
    }
//calculate Longest Side
    public double getLongestSide(){
        double longSide = 0;

        for (int i = 0; i < shape.size(); i++) {
            Point cPoint = shape.get(i);
            Point nPoint = shape.get((i + 1) % shape.size());
            if(cPoint.Distance(nPoint) > longSide){
                longSide = cPoint.Distance(nPoint);
            }
        }
        return longSide;
    }
// Return all
    public String toString(){
        return "Perimetr: "+calcPerimeter()+
                "\nAverage: " + getAverageSide()+
                "\nLongside: " + getLongestSide();
    }
}