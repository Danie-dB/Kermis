package KermisApp;

import java.util.Scanner;

public class KermisMain {

	public static void main(String[] args) {
		Attractie joy = new Attractie();
		kermisKassa kas = new kermisKassa();
	
		System.out.println("We gaan naar de kermis!");
		System.out.println("Er zijn 6 atracties, naar welke wilt u?");
		Scanner scanner = new Scanner(System.in);
		
		boolean doorgaan = true;
		while (doorgaan) {
			System.out.println("Wilt u een ritje maken? Kies 'J' voor ja en 'N' voor nee");
			String antwoord = scanner.nextLine();
			antwoord = antwoord.toLowerCase();
			switch (antwoord) {
			case "j":
				joy.draaien();
				break;
			case "n":
				System.out.println("U wil de kermis verlaten \n");
				doorgaan = false;
				break;
			default:
				System.out.println("Kies een geldige invoer.");
			}
		}
		
		System.out.println("Dat was mij een dagje wel! De kermis is nu gesloten.");
		
		boolean kassaJa = true;
		while (kassaJa) {
			System.out.println("Wilt u de omzet of het aantal kaartjes weten? Kies j of n");
			String checkKassa = scanner.nextLine();
			checkKassa = checkKassa.toLowerCase();
			switch (checkKassa) {
			case "j": 
				kas.KassaTelling();
				break;
			case "n":
				System.out.println("U wilt stoppen met het tellen en gaat lekker naar huis. \n");	
				kassaJa = false;
				break;
			default: 
				System.out.println("Kies een geldige invoer.");
				
			}
		}
		
		
	}

}