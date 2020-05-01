package com.instrucciones.main;

public class Switch {

	public static void main(String[] args) {
		// Switch = cambiar
		String lightColor;
		lightColor = "Pink";

		switch (lightColor) {
		case "Green":
			System.out.println("Carry on");

			break;
		case "Yellow":
			System.out.println("Move slowly");

			break; 
			
		case "Red":
			System.out.println("Stop");

			break;
		default:
			System.out.println("Invalid light Color");

		}
	}

}
