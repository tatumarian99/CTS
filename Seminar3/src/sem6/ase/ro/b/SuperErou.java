package sem6.ase.ro.b;

public class SuperErou {
	
	String nume;
	int puncteViata;
	
	boolean esteNegativ;
	boolean esteRanitGrav;
	
	InterfataArma armaStanga;
	InterfataArma armaDreata;
	InterfataSuperPutere superPutere;
	InterfataSuperPutere superSuperPutere;
	
	private SuperErou() {
		
	}

	private SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav,
			InterfataArma armaStanga, InterfataArma armaDreata, InterfataSuperPutere superPutere,
			InterfataSuperPutere superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteNegativ = esteNegativ;
		this.esteRanitGrav = esteRanitGrav;
		this.armaStanga = armaStanga;
		this.armaDreata = armaDreata;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}
	
	public static class SuperErouBuilder{
		SuperErou supererou;
		public SuperErouBuilder(String nume, int puncteViata) {
			this.supererou=new SuperErou();
			this.supererou.nume=nume;
			this.supererou.puncteViata=puncteViata;
		}
		
		public SuperErouBuilder esteNegativ() {
			this.supererou.esteNegativ=true;
			return this;
		}
		
		public SuperErouBuilder esteRanit() {
			this.supererou.esteRanitGrav=true;
			return this;
		}
		
		public SuperErouBuilder setArmaStanga(InterfataArma arma) {
			this.supererou.armaStanga=arma;
			return this;
		}
		public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
			this.supererou.armaDreata=arma;
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(InterfataSuperPutere putere) {
			
			return this;
		}
		
		public SuperErou build() {
			return this.supererou;
		}
		
	}
	
	
}
