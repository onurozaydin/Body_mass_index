package java101;

import java.util.Scanner;

public class Body_mass_index {

	public static void main(String[] args) {
		double height,kilo;
		double bmi;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		height = inp.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz : ");
		kilo = inp.nextDouble();
		
		height = height / 100.0;
		
		double sonuc = (kilo / (height * height));
                System.out.print("Vücut kitle endeksiniz : "+ sonuc);
				

	}

}
