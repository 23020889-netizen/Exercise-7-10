package ShapeDetail;

public class Square extends Shape {
    private Point centerPoint;
    public Square(double x,double y) {
        this.centerPoint = new Point(x, y);
    }

    public String showDetails() {
        return "Square, centerpoint: " + centerPoint.toString();
    }

    public Point getPoint() {
        return centerPoint;
    }
}
