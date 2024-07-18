//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Circle circle1=new Circle(4);

System.out.println("The radius for the circle is: "+circle1.getRadius());
System.out.println("After calculatig the area of the circle: "+circle1.calculateArea());
System.out.println("After calculatig the Circumference of the circle: "+circle1.calculateCircumference());
        System.out.println("---------------------");
Rectangle rectangle1=new Rectangle(4,5);

        System.out.println("the width of the rectangle is: "+rectangle1.getWidth());
        System.out.println("the height of the rectangle is: "+rectangle1.getHeight());
        System.out.println("After calculatig the area of the rectangle: "+rectangle1.calculateArea());
        System.out.println("After calculating the perimeter of the rectangle: "+rectangle1.calculateCircumference());

        System.out.println("------------------------");



        Triangle triangle1 = new Triangle(5,5);





        System.out.println("the height of the triangle is: " + triangle1.getHeight());
        System.out.println("the base of the triangle is: " + triangle1.getBase());
        System.out.println("After calculatig the area of the triangle: " + triangle1.calculateArea());
        System.out.println("After calculating the Perimeter of th triangle: " + triangle1.calculateCircumference());




    }
}