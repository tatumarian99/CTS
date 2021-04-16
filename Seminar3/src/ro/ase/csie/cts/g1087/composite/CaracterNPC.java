package ro.ase.csie.cts.g1087.composite;

public class CaracterNPC extends NodAbstractStructura{

	String nume;
	int putere;
	
	
	
	public CaracterNPC(String nume, int putere) {
		super();
		this.nume = nume;
		this.putere = putere;
	}

	@Override
	public void atacaJucator(String numeJucator) {
		System.out.println(String.format("%s ataca pe %s",nume,numeJucator));
	}

	@Override
	public void seRetrage() {
		System.out.println(String.format("%s se retrage",nume));
	}

	@Override
	public void seDeplaseaza() {
		System.out.println(String.format("%s se deplaseaza",nume));
	}

	@Override
	public void adaugaNod(NodAbstractStructura nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void stergeNod(NodAbstractStructura nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NodAbstractStructura getNod(int index) {
		throw new UnsupportedOperationException();
	}

}
