public class Circle extends Shape{
public  double radius;

    private Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14*(radius*radius);
    }

    @Override
    public double calculateCircumference() {
        return 2*3.14*radius;
    }

}
