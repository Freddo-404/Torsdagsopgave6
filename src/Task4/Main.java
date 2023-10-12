package Task4;

public class Main {
    public static void main(String [] args){

    Circle circle = new Circle(2);
    Square square = new Square(8);
        System.out.println(circle.getArea());
        System.out.println(square.getArea());

        ShapeBuilder sb = new ShapeBuilder();
        sb.addShape(circle);
        sb.addShape(square);
        System.out.println(sb.getTotalArea());
    }
}
