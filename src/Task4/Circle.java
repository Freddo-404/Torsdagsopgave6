package Task4;

public class Circle implements Shape {
    double r;

    Circle(double r){
        this.r = r;
    }

    @Override
    public double getArea() {
        return  3.14*r*r;
    }
}
