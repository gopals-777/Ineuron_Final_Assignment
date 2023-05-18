package in.grs.shapes;

import in.grs.shape.Shape;

public class Triangle implements Shape {

	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (base * height) / 2;
	}

	@Override
	public double getPerimeter() {
		return base + height + Math.sqrt(base * base + height * height);
	}

}
