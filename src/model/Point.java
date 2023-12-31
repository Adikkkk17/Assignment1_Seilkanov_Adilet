package model;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point dest) {
        double dx = this.x - dest.x, dy = this.y - dest.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
