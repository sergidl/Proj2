// javac --module cat.institutmvm.application -d bin --module-source-path .\*\src\;javac --module com.institutmvm.controller -d bin --module-source-path .\*\src\;java --module-path .\bin --module com.institutmvm.controller/com.institutmvm.controller.ui.App


package com.institutmvm.controller.ui;

import cat.institutmvm.application.entities.Colour;
import cat.institutmvm.application.utils.MyMath;
public class App {
	public static void main(String[] args) {
		System.out.println(MyMath.isEven(2));
		System.out.println(MyMath.min(1,2,3,4,5,9,8,7,6));
		System.out.println(MyMath.max(1,2,3,4,5,9,8,7,6));
		
		//random colour
		Colour c = new Colour('asdasd',2,4,6);
		System.out.println(c.getName());
		System.out.println(c.getRed());
		System.out.println(c.getGreen());
		System.out.println(c.getBlue());

		
	}
	
}
