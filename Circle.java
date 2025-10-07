public class Circle extends Shape {
    private Point centerPoint;
    public Circle(double x,double y) {
        this.centerPoint.setX(x);
        this.centerPoint.setY(y);
    }

    public String toString() {
        return "Circle, centerpoint: " + centerPoint.toString();
    }
}