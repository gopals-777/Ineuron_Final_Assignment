package in.grs.shapes;

import in.grs.shape.Shape;

public class Recatngle implements Shape {

	private double length;
	private double breadth;

	public Recatngle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double getArea() {

		return length * breadth;
	}

	@Override
	public double getPerimeter() {
		return 2 * (length + breadth);
	}

}
