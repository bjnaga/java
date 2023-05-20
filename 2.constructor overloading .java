package com.bmscw.demoabstract;

import java.util.Scanner;

class Area {
	private float l, area, r, b;

	public Area() {
		l = 0;
		area = 0;
		r = 0;
		b = 0;
		System.out.println("Empty object created with default values");

	}

	public Area(float l)// Accepts lenth of a square and calculates the area of square
	{
		this.l = l;
		area = l * l;
	}

	 public Area(float r,int temp)
	 {
	 this.r = r;
	 area = (float) (3.14 * r * r);
	 }
	 
	public Area(float l, float b)// rect
	{
		this.l = l;
		this.b = b;
		area = l * b;

	}

	 public Area(float l,float b, int temp)
	 {
	 this.l=l;
	 this.b=b;
	 area=(float)0.5*l*b;
	 }
	void display() {
		System.out.println("Area  =" + area);
	}

}

public class AreaDemo {

	public static void main(String[] args) {
		System.out.println("Calculating area");
		System.out.println("Enter the length of a square");
		Scanner inn = new Scanner(System.in);
		Area obj1 = new Area(inn.nextFloat());
		obj1.display();
		System.out.println("Enter the length and breath for rectangel:");
		Area obj2 = new Area(inn.nextFloat(), inn.nextFloat());
		obj2.display();
		System.out.println("Enter radius to calculate the area of a circle ");	
		Area obj3=new Area(inn.nextFloat(), 10);
		obj3.display();
		System.out.println("Enter base and height to find area of triangle");	
		Area obj4=new Area(inn.nextFloat(),inn.nextFloat(), 10 );
		obj4.display();
		

	}
}
