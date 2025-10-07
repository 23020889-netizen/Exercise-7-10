package AbstractClass;

public class Circle extends Shape {
    private Point centerPoint;
    public Circle(double x,double y) {
        this.centerPoint = new Point(x, y);
    }

    public Point getPoint() {
        return centerPoint;
    }

    public String toString() {
        return "Circle, centerpoint: " + centerPoint.toString();
    }
}