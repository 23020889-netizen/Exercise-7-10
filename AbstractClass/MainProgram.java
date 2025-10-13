package AbstractClass;
import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Rectangle(2, 3));
        shapeList.add(new Circle(6, 07));
        shapeList.add(new Square(10, 10));
        int count  = 0;
        for(Shape s : shapeList) {
            if (s instanceof Shape) {
                count ++;
            }
        }
        System.out.println("So luong hinh khoi tao " + count);
        System.out.println("Danh sach chi tiet cac hinh:");
        for(Shape s : shapeList) {
            if (s instanceof Shape) {
                System.out.println(s.toString());
            }
        }
        System.out.println("Danh sach tam diem:");
        for(Shape s : shapeList) {
            if (s instanceof Shape) {
                System.out.println(s.getPoint().toString());
            }
        }
        
    }
}