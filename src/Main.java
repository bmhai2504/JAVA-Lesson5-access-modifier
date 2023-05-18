public class Main {
    public static void main(String[] args) {
        Circle cir1 = new Circle(4);
        Circle cir2 = new Circle();

        System.out.println("Radius: " + cir1.getRadius());
        System.out.println("Area of cirlce: " + cir1.getArea());
        System.out.println("Radius: " + cir2.getRadius());
        System.out.println("Area of cirlce: " + cir2.getArea());
    }
}