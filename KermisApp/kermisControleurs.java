package KermisApp;

import java.util.Random;

public class kermisControleurs {
	
		void spinKeuring() {
		Spin draaierig = new Spin();
		int draaiLimietSpin = draaierig.keuringSpin;
		if (draaiLimietSpin == 5) {
			System.out.println("**Keuring nodig voor de Spin** \n");
			System.out.println("*******************************");
		}
		
		}
		void hawaaiKeuring(){
		Hawaii zonnig = new Hawaii();
		int draaiLimietHawaii = zonnig.keuringHawaii;
		if (draaiLimietHawaii == 10) {
			System.out.println("**Keuring nodig voor Hawaii **");
			System.out.println("*******************************");
		}
		
		}
}


class BelastingInspecteur {
	int b;
	int langskomen() {
		Random langskomen = new Random();
		b = langskomen.nextInt(4)+1;
		return b;
	}
}
