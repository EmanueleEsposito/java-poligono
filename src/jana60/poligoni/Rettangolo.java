package jana60.poligoni;

public class Rettangolo implements Poligono {
	// Attributi
	private int base;
	private int altezza;

	// Costruttore
	public Rettangolo(int base, int altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	// Override Interfaccia

	@Override
	public void calcolaPerimetro() {
		System.out.println("Il perimetro del rettangolo è: " + (base + altezza) * 2);

	}

	@Override
	public void calcolaArea() {
		System.out.println("L'area del rettangolo è: " + base * altezza);

	}

}
