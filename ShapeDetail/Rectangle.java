package ShapeDetail;

public class Rectangle extends Shape {
    private Point centerPoint;
    public Rectangle(double x,double y) {
        this.centerPoint = new Point(x, y);
    }

    public Point getPoint() {
        return centerPoint;
    }

    public String showDetails() {
        return "Rectangle, centerpoint: " + centerPoint.toString();
    }
}
