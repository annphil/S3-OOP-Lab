/*P5. Write a Java program to calculate the area of different shapes namely circle, rectangle and triangle using the concept of method overloading.*/
import java.util.Scanner;
import java.lang.Math;

class Area{
	void area (int r){
		System.out.println("Area of circle = " + 3.14*r*r );
	}
	void area (int l, int b){
		System.out.println("Area of rectangle = " + l*b );
	}
	void area (int a, int b, int c){
		double s=(a+b+c)/2;
		double f = Math.sqrt(s*(s-a)*(s-b)*(s-c) ) ;
		System.out.println("Area of triangle = " + f );
	}
}	

class Main{
	public static void main(String[ ] args){
		int r, l, b, a, k, c;
		Scanner sc = new Scanner(System.in);
		Area ar = new Area();
		
		System.out.print("Enter radius of circle: ");
		r = sc.nextInt();
		ar.area(r);
		System.out.print("Enter length and breadth of rectangle: ");
		l = sc.nextInt();
		b = sc.nextInt();
		ar.area(l, b);
		System.out.print("Enter length of sides of triangle: ");
		a = sc.nextInt();
		k = sc.nextInt();
		c = sc.nextInt();
		ar.area(a,k,c);
	
	}
}
