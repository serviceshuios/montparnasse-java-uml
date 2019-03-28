package com.infotel.presentation;

import java.util.Scanner;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Veuillez saisir un nombre:");
		Scanner sc = new Scanner(System.in) ;
		int nombre =  sc.nextInt();
		
		if(nombre <= 0) {
			System.out.println("LE NOMBRE SAISI EST NEGATIF");
		}
		else {
			System.out.println("LE NOMBRE SAISI EST POSITIF");
		}
		sc.close();
	}

}
