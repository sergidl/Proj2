package com.institutmvm.controller.ui;

import cat.institutmvm.application.entities.Persona;
import cat.institutmvm.application.utils.MyMath;
public class App {
	public static void main(String[] args) {
		Persona p = new Persona("Jordi");
		System.out.println(p.getNom());
		System.out.println(MyMath.isEven(2));
		System.out.println(MyMath.min(1,2,3,4,5,9,8,7,6));
		System.out.println(MyMath.max(1,2,3,4,5,9,8,7,6));
	}
	
}
