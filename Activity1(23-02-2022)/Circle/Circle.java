package com.innovation.shapes;

public class Circle {
	float radius=1.5f;
	float pi=3.5f;
//	float area;
//	float circumference;
public Circle()
{
	System.out.println("Radius of the Circle :"+radius);
}
public void radius(float radius)
{
	this.radius=radius;
}
public void radius(float radius,float pi) 
{
	this.radius=radius;
	this.pi=pi;
}
public float calculateCircleArea(float radius,float pi)
{
	return (pi*radius*radius);
}
public float calculateCircumference(float radius,float pi)
{
	return (2*pi*radius);
}

public static void main(String args[]) 
{
	Circle c1=new Circle();
	System.out.println("CalculateCircumference :"+c1.calculateCircleArea(1.5f,3.5f));
	System.out.println("CalculateCircumference :"+c1.calculateCircumference(1.5f,3.5f));
}
}