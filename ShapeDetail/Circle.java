package ShapeDetail;

public class Circle extends Shape {
    private Point centerPoint;
    public Circle(double x,double y) {
        this.centerPoint = new Point(x, y);
    }

    public Point getPoint() {
        return centerPoint;
    }

    public String showDetails() {
        return "Circle, centerpoint: " + centerPoint.toString();
    }
}
