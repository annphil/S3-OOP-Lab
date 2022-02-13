/*B5. Write a Java program to create an abstract class named Shape that contains an empty method named numberOfSides(). Provide three classes named Rectangle, Triangle, and Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method numberOfSides()that shows the number of sides in the given geometrical structures. */


abstract class Shape{
	void numberOfSides(){
	}
}

class Rectangle extends Shape{
	void numberOfSides(){
		System.out.println("Number of sides in rectangle = 4");
	}
}

class Triangle extends Shape{
	void numberOfSides(){
		System.out.println("Number of sides in triangle = 3");
	}
}

class Hexagon extends Shape{
	void numberOfSides(){
		System.out.println("Number of sides in hexagon = 6 ");
	}
}

class Main{
	public static void main(String args[ ]){
		Rectangle r = new Rectangle();
		r.numberOfSides();
		Triangle t = new Triangle();
		t.numberOfSides();
		Hexagon h = new Hexagon();
		h.numberOfSides();
	}
}
