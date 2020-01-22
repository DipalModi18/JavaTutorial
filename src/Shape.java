
public abstract class Shape {

	int myShapeAttr = 0;
	
	public abstract float area();
}

class Circle extends Shape {
	int radius;
	int myShapeAttr = 1;
	
	Circle(int radius) {
		this.radius = radius;
	}
	
	public float area() {
		return 3.14f*radius*radius;
	}
}


class Square extends Shape {
	int length;
	int myShapeAttr = 2;
	
	Square(int length) {
		this.length = length;
	}
	
	public float area() {
		return length*length;
	}
}


class Rectangle extends Shape {
	int length, width;
	int myShapeAttr = 3;
	
	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public float area() {
		return length*width;
	}
}
