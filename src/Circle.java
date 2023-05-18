public class Circle {
    private double radius;
    private String color;
    public Circle(){
        radius = 1;
        color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius * this.radius * 3.14;
    }
}
