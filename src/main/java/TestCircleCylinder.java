public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.setColor("black");
        System.out.println("The radius is " + circle.getRadius());
        System.out.println(circle.toString());
        System.out.println("The area is " + circle.getArea());
        System.out.println();

        Cylinder cylinder = new Cylinder(6, 7);
        cylinder.setColor("blue");
        System.out.println("The radius is: " + cylinder.getRadius());
        System.out.println(cylinder.toString());
        System.out.println("The area is " + cylinder.getArea());
    }
}
