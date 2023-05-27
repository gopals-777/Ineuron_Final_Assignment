package in.grs.main;
//Abstract class example
abstract class Shape {
 private String color;

 public Shape(String color) {
     this.color = color;
 }

 // Abstract method to calculate area
 public abstract double calculateArea();

 // Concrete method
 public void displayColor() {
     System.out.println("Color: " + color);
 }
}

//Interface example
interface Drawable {
 void draw();
}

//Concrete class extending an abstract class and implementing an interface
class Circle extends Shape implements Drawable {
 private double radius;

 public Circle(String color, double radius) {
     super(color);
     this.radius = radius;
 }

 // Implementation of abstract method to calculate area
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 // Implementation of interface method to draw
 @Override
 public void draw() {
     System.out.println("Drawing a circle");
 }
}

public class AbstractClassVsInterface {
 public static void main(String[] args) {
     Circle circle = new Circle("Red", 5.0);
     circle.displayColor();
     circle.draw();
     double area = circle.calculateArea();
     System.out.println("Area: " + area);
 }
}


