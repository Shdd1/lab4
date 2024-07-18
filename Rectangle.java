public class Rectangle extends Shape{
    private double hight;
    private   double width;
    public Rectangle() {
    }


    public Rectangle(double hight, double width) {
        this.hight = hight;
        this.width = width;
    }

    public Rectangle(int x, int y, double hight) {
        super(x, y);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return width*hight;
    }

    @Override
    public double calculateCircumference() {
        return 2*(width+hight);
    }

}
