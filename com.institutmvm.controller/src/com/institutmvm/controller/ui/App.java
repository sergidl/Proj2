package com.institutmvm.controller.ui;

import cat.institutmvm.application.entities.Persona;
import cat.institutmvm.application.utils.MyMath;
public class App {
	public static void main(String[] args) {
		Persona p = new Persona("Jordi");
		System.out.println(p.getNom());
		System.out.println(MyMath.isEven(2));
	}
	
}
