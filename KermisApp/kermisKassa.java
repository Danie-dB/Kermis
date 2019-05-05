package KermisApp;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.RoundingMode;

public class kermisKassa {
	static double omzetTotaal;
	static double OmzetBots;
	static double OmzetSpin;
	static double OmzetSpiegel;
	static double OmzetSpook;
	static double OmzetHawaii;
	static double OmzetLadder;
	
	static double BelastingBetaler;
	static double BelastingSpin;
	

	final static DecimalFormat dF = new DecimalFormat("##,##");
	
	static int alleBotsKaartjes;
	static int alleSpinKaartjes;
	static int alleSpiegelKaartjes;
	static int alleSpookKaartjes;
	static int alleHawaiiKaartjes;
	static int alleLadderKaartjes;
	static int alleKaartjes;
	
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
					System.out.println("Er zijn vandaag in totaal " + alleKaartjes + " kaartjes verkocht: \n");
					System.out.println(alleBotsKaartjes+ " voor de botsauto's,");
					System.out.println(alleSpinKaartjes + " voor de Spin,");
					System.out.println(alleSpiegelKaartjes + " van het Spiegelhuis,");
					System.out.println(alleSpookKaartjes + " van het Griezelhuis,");
					System.out.println(alleHawaiiKaartjes + " voor het zonnige Hawaii,");
					System.out.println("And last but not least: " + alleLadderKaartjes + " kaartjes om de ladder op te komen. \n");
				       }
				else {
					System.out.println("Er zijn vandaag geen kaartjes verkocht helaas... \n");
				}	
				telling = false;
				break;
				
			case "o":
				if (kermisKassa.omzetTotaal > 0 ) {
					System.out.println("De gedraaide omzet bedraagt " + omzetTotaal + " euro. \n");
					System.out.println("Er is " + dF.format(OmzetBots) + " euro verdient met de botsauto's,");
					System.out.println(dF.format(OmzetSpin) + " euro met de Spin,");
					System.out.println("Het spiegeleffect leverde " + dF.format(OmzetSpiegel) + " euro op,");
					System.out.println(dF.format(OmzetSpook) + " euro om van te griezelen,");
					System.out.println("Koop zonnebrand met " + dF.format(OmzetHawaii) + " euro uit Hawaii,");
					System.out.println("En ze probeerde voor " + dF.format(OmzetLadder) + " euro die verrekte ladder op te komen... \n");
					
					OmzetLadder = OmzetLadder*0.30;
					BelastingBetaler = (BelastingBetaler*5) * 0.30;
					OmzetLadder = OmzetLadder - BelastingBetaler;
					
					OmzetSpin = OmzetSpin*0.30;
					BelastingSpin = (BelastingSpin*5) *0.30;
					OmzetSpin = OmzetSpin - BelastingSpin;
					
					System.out.println("Er is al " + dF.format(OmzetSpin) +  " euro betaald aan de Geldrover voor de Spin.");
					System.out.println("Er is in totaal " + dF.format(OmzetLadder) + " euro aan de Geldrover betaald voor de ladder.");
					System.out.println("Er staat in totaal nog " + dF.format(BelastingBetaler + BelastingSpin) + " euro gereserveerd voor de Geldrover \n");
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
	
	void kansSpelBelasting() {
		double gokLadder = OmzetLadder*0.30;
		double gokSpin = OmzetSpin*0.30;
	}
}
