package in.grs.main;

import in.grs.shape.Shape;
import in.grs.shapes.Circle;
import in.grs.shapes.Recatngle;
import in.grs.shapes.Square;
import in.grs.shapes.Triangle;

public class MainApp {
	public static void main(String[] args) {
		 
			Shape circle = new Circle(5);
			System.out.println("\t*****************************\n");
	        System.out.println("Circle area: " + circle.getArea());
	        System.out.println("Circle perimeter: " + circle.getPerimeter());
			System.out.println("\t*****************************\n");

	        Shape triangle = new Triangle(3, 4);
	        System.out.println("Triangle area: " + triangle.getArea());
	        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
			System.out.println("\t*****************************\n");

	        Shape rectangle=new Recatngle(10, 20);
			System.out.println("Rectangle area is : " + rectangle.getArea());
			System.out.println("Rectangle perimeter is :" + rectangle.getPerimeter());
			System.out.println("\t*****************************\n");

			Shape square = new Square(8);
			System.out.println("Square Area is " + square.getArea());
			System.out.println("Square Perimeter is " + square.getPerimeter());
			System.out.println("\t*****************************\n");
	    }
	}


