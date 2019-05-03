package KermisApp;

import java.util.Scanner;

public class kermisKassa {
	static double omzetTotaal;
	static double OmzetBots;
	static double OmzetSpin;
	static double OmzetSpiegel;
	static double OmzetSpook;
	static double OmzetHawaii;
	static double OmzetLadder;
	
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
					System.out.println(alleBotsKaartjes + " voor de botsauto's,");
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
					System.out.println("Er is " + OmzetBots + " euro verdient met de botsauto's,");
					System.out.println(OmzetSpin + " euro met de Spin,");
					System.out.println("Het spiegeleffect leverde " + OmzetSpiegel + " euro op,");
					System.out.println(OmzetSpook + " euro om van te griezelen,");
					System.out.println("Koop zonnebrand met " + OmzetHawaii + " euro uit Hawaii,");
					System.out.println("En ze probeerde voor " + OmzetLadder + " euro die verrekte ladder op te komen... \n");
					System.out.println("Dat was de totale omzet van vandaag! \n");
					System.out.println("Voor de belastingdienst: ");
					kansSpelBelasting();
					System.out.println(" ");
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
		System.out.println("Het gereserveerde geld voor de Geldrover is: " + gokLadder + " euro.");
		
	}
}
