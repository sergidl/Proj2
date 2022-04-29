// javac --module cat.institutmvm.application -d bin --module-source-path .\*\src\;javac --module com.institutmvm.controller -d bin --module-source-path .\*\src\;java --module-path .\bin --module com.institutmvm.controller/com.institutmvm.controller.ui.App

package com.institutmvm.controller.ui;

import cat.institutmvm.application.entities.Colour;
import cat.institutmvm.application.utils.MyMath;
public class App {
	public static void main(String[] args) {
		// System.out.println(MyMath.isEven(2));
		// System.out.println(MyMath.min(1,2,3,4,5,9,8,7,6));
		// System.out.println(MyMath.max(1,2,3,4,5,9,8,7,6));
		
		Colour c = new Colour("random");
		System.out.println(c.getName());
		System.out.println(c.getRed());
		System.out.println(c.getGreen());
		System.out.println(c.getBlue());
		
		Colour c2 = new Colour();
		System.out.println(c2.getName());
		System.out.println(c2.getRed());
		System.out.println(c2.getGreen());
		System.out.println(c2.getBlue());

		Colour c3 = new Colour("violet", 255, 8, 250);
		System.out.println(c3.getName());
		System.out.println(c3.getRed());
		System.out.println(c3.getGreen());
		System.out.println(c3.getBlue());

		Colour c4 = new Colour(10, 20, 30);
		System.out.println(c4.getName());
		System.out.println(c4.getRed());
		System.out.println(c4.getGreen());
		System.out.println(c4.getBlue());
		
	}
	
}
