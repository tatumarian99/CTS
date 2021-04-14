package sem8.facade.ase.ro.adapter;

import java.util.ArrayList;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaracterFantastic dragon = new CaracterFantastic("Dragonul albastru", 1000);
		dragon.seDeplaseaza();
		dragon.esteLovit(200);
		dragon.seVindeca(100);
		
		DonaldDuck donaldDuck = new DonaldDuck();
		donaldDuck.setPower(500);
		donaldDuck.move(100, 100);
		donaldDuck.primesteLovitura(50);
		donaldDuck.reincarca(50);
		
		ArrayList<ACMECaracterJoc> caractere = new ArrayList<>();
		caractere.add(dragon);
	}

}
