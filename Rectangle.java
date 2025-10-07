public class Rectangle extends Shape {
    private Point centerPoint;
    public Rectangle(double x,double y) {
        this.centerPoint.setX(x);
        this.centerPoint.setY(y);
    }

    public String toString() {
        return "Rectangle, centerpoint: " + centerPoint.toString();
    }
}