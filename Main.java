//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("******** Circle **************");

        Circle c = new Circle(3,4,5);
        System.out.println("Radius :"+c.getRadius());
        c.setRadius(3);
        System.out.println("New Radius :"+c.getRadius());
        System.out.println("Area for Circle :"+c.calculateArea());
        System.out.println("Circumference for Circle :"+c.calculateCircumference());

        System.out.println("********* Rectangle **********");

        Rectangle r=new Rectangle(5,5);
        System.out.println("width :"+r.getWidth()+" hight :"+r.getHight());
        System.out.println("Area for Rectangle :"+r.calculateArea());
        System.out.println("perimeter for Rectangle :"+r.calculateCircumference());


        System.out.println("********* Triangle **********");

        Triangle t=new Triangle();
        t.setBase(5);
        t.setHeight(10);
        System.out.println("Area for Triangle :"+t.calculateArea());
        System.out.println("perimeter for Triangle :"+t.calculateCircumference());






    }
}