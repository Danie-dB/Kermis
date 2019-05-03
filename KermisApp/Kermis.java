
package KermisApp;

import java.util.Random;
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
		kermisControleurs sjaak = new kermisControleurs();
		BelastingInspecteur john = new BelastingInspecteur();
		
		while (ride) {
			john.langskomen();
			if (john.b == 3) {
				System.out.println("*!! De belastingInspecteur staat op uw stoep!!*");
				kassa.kansSpelBelasting();
				omhoog.belastingBetaal();
				System.out.println("*********************************************** \n");
				System.out.println(" ");
				omhoog.ladderKaartB = 0;
			}

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
				draaierig.keuringSpin = draaierig.spinKaart;
				sjaak.spinKeuring();
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
				zonnig.keuringHawaii = zonnig.hawaiiKaart;
				sjaak.hawaaiKeuring();
				ride = false; 
				break;
				
			case "6":
				System.out.println("De attractie " + omhoog.naam + " hangt voor u klaar! \n");
				omhoog.ladderKaart = omhoog.ladderKaart +1;
				omhoog.ladderKaartB = omhoog.ladderKaartB+1;
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
		kassa.BelastingBetaler = omhoog.ladderKaartB;
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
	static int keuringSpin = 5;
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
	static int keuringHawaii = 10;
}

class Ladderklimmen extends Attractie {
	static int objectnr = 6;
	String naam = "Ladderklimmen";
	double oppervlakte = 2*3;
	static double ladderPrijs = 5.00;
	static int ladderKaart = 0;
	static double ladderKaartB = 0;
	
	void belastingBetaal() {
		double Bet = (ladderKaartB * ladderPrijs) *0.30;
		System.out.println("U moet " + Bet + " euro dokken.");
	}
	
}