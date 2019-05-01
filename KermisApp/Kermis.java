
package KermisApp;

import java.util.Scanner;

public class Kermis {
	Attractie nr = new Attractie();
}

class Attractie {
	void draaien() {
		boolean ride = true;
		System.out.println("Naar welke atractie wilt u graag?");
		Botsautos bump = new Botsautos();
		Spin draaierig = new Spin();
		Spiegelpaleis mirror = new Spiegelpaleis();
		Spookhuis spooky = new Spookhuis();
		Hawaii zonnig = new Hawaii();
		Ladderklimmen omhoog = new Ladderklimmen();
		kermisKassa kassa = new kermisKassa();
		
		while (ride) {
			System.out.println("Kies een getal tussen 1 en 6:");
			Scanner scanner = new Scanner(System.in);
			String keuze = scanner.nextLine();
			switch (keuze) {
			case "1":
				System.out.println(" U gaat botsen met de " + bump.naam + "! \n");
				bump.botsKaart = bump.botsKaart +1;
				ride = false;
				break;
				
			case "2":
				System.out.println("De attractie " + draaierig.naam + " draait! \n");
				draaierig.spinKaart = draaierig.spinKaart +1;
				ride = false;
				break;
				
			case "3":
				System.out.println("Spiegeltje spiegeltje aan de wand... have fun in het " + mirror.naam + "! \n");
				mirror.spiegelKaart = mirror.spiegelKaart +1;
				ride = false;
				break;
				
			case "4":	
				System.out.println("Griezel ze in het " + spooky.naam + "... \n");
				spooky.spookKaart = spooky.spookKaart +1;
				ride = false;
				break;
				
			case "5":
				System.out.println("U gaat naar het zonnige " + zonnig.naam + "! \n");
				zonnig.hawaiiKaart = zonnig.hawaiiKaart +1;
				ride = false;
				break;
				
			case "6":
				System.out.println("De attractie " + omhoog.naam + " hangt voor u klaar! \n");
				omhoog.ladderKaart = omhoog.ladderKaart +1;
				ride = false;
				break;
				
			default:
				System.out.println("kies 1 van de 6 opties... \n");
				break;				
			}
		}
		kassa.alleBotsKaartjes = bump.botsKaart;
		kassa.alleSpinKaartjes = draaierig.spinKaart;
		kassa.alleSpiegelKaartjes = mirror.spiegelKaart;
		kassa.alleSpookKaartjes = spooky.spookKaart;
		kassa.alleHawaiiKaartjes = zonnig.hawaiiKaart;
		kassa.alleLadderKaartjes = omhoog.ladderKaart;
		kassa.alleKaartjes = bump.botsKaart + draaierig.spinKaart + mirror.spiegelKaart + spooky.spookKaart + zonnig.hawaiiKaart + omhoog.ladderKaart;  
	
		kassa.OmzetBots = kassa.alleBotsKaartjes * bump.botsPrijs;
		kassa.OmzetSpin = kassa.alleSpinKaartjes * draaierig.spinPrijs;
		kassa.OmzetSpiegel = kassa.alleSpiegelKaartjes * mirror.spiegelPrijs;
		kassa.OmzetSpook = kassa.alleSpookKaartjes * spooky.spookPrijs;
		kassa.OmzetHawaii = kassa.alleHawaiiKaartjes * zonnig.hawaiiPrijs;
		kassa.OmzetLadder = kassa.alleLadderKaartjes * omhoog.ladderPrijs;
		kassa.omzetTotaal = kassa.OmzetBots + kassa.OmzetSpin + kassa.OmzetSpiegel + kassa.OmzetSpook + kassa.OmzetHawaii + kassa.OmzetLadder;
	
	}
	
	void KassaTelling() {
		boolean telling = true;
		while (telling) {
			System.out.println("Wilt u de omzet weten (o) of het aantal verkocht kaartjes (k)?");
			Scanner scanner = new Scanner(System.in);
			String kastelling = scanner.nextLine();
			kastelling = kastelling.toLowerCase();
			
			switch (kastelling) {
			case "k":
				if (kermisKassa.alleKaartjes > 0) {
					System.out.println("Er zijn vandaag in totaal " + kermisKassa.alleKaartjes + " kaartjes verkocht: \n");
					System.out.println(kermisKassa.alleBotsKaartjes + " voor de botsauto's,");
					System.out.println(kermisKassa.alleSpinKaartjes + " voor de Spin,");
					System.out.println(kermisKassa.alleSpiegelKaartjes + " van het Spiegelhuis,");
					System.out.println(kermisKassa.alleSpookKaartjes + " van het Griezelhuis,");
					System.out.println(kermisKassa.alleHawaiiKaartjes + " voor het zonnige Hawaii,");
					System.out.println("And last but not least: " + kermisKassa.alleLadderKaartjes + " kaartjes om de ladder op te komen. \n");
				       }
				else {
					System.out.println("Er zijn vandaag geen kaartjes verkocht helaas... \n");
				}
					
				telling = false;
				break;
			case "o":
				if (kermisKassa.omzetTotaal > 0 ) {
					System.out.println("De gedraaide omzet bedraagt " + kermisKassa.omzetTotaal + " euro. \n");
					System.out.println("Er is " + kermisKassa.OmzetBots + " euro verdient met de botsauto's,");
					System.out.println(kermisKassa.OmzetSpin + " euro met de Spin,");
					System.out.println("Het spiegeleffect leverde " + kermisKassa.OmzetSpiegel + " euro op,");
					System.out.println(kermisKassa.OmzetSpook + " euro om van te griezelen,");
					System.out.println("Koop zonnebrand met " + kermisKassa.OmzetHawaii + " euro uit Hawaii,");
					System.out.println("En ze probeerde voor " + kermisKassa.OmzetLadder + " euro die verrekte ladder op te komen... \n");
					System.out.println("Dat was de totale omzet van vandaag! \n");
				}
				else {
					System.out.println("Er is helaas geen omzet gedraaid vandaag... \n");
				}
				telling = false;
				break;
			default:
				System.out.println("kies geldige invoer: 'k' of 'o'.");
				break;
			}
		}
	}
}

class Botsautos extends Attractie {
	static int objectnr = 1;
	String naam = "Botsautos";
	double oppervlakte = 9*5;
	static double botsPrijs = 2.50;
	static int botsKaart = 0;
}

class Spin extends Attractie {
	static int objectnr = 2;
	String naam = "Spin";
	double oppervlakte = 4*6;
	static double spinPrijs = 2.25;
	static int spinKaart = 0;
}

class Spiegelpaleis extends Attractie {
	static int objectnr = 3;
	String naam = "Spiegelpaleis";
	double oppervlakte = 8*7;
	static double spiegelPrijs = 2.75;
	static int spiegelKaart = 0;
}

class Spookhuis extends Attractie {
	static int objectnr = 4;
	String naam = "Spookhuis";
	double oppervlakte = 5*7;
	static double spookPrijs = 3.20;
	static int spookKaart = 0;
}

class Hawaii extends Attractie {
	static int objectnr = 5;
	String naam = "Hawaii";
	double oppervlakte = 3*4;
	static double hawaiiPrijs = 2.90;
	static int hawaiiKaart = 0;
}

class Ladderklimmen extends Attractie {
	static int objectnr = 6;
	String naam = "Ladderklimmen";
	double oppervlakte = 2*3;
	static double ladderPrijs = 5.00;
	static int ladderKaart = 0;
}