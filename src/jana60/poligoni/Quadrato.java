package jana60.poligoni;

public class Quadrato implements Poligono {
	// Attributi
	private int lato;
	// Costruttore

	public Quadrato(int lato) {
		super();
		this.lato = lato;
	}

//Override Interfaccia

	@Override
	public void calcolaPerimetro() {
		System.out.println("Il parimetro del quadrato è: " + lato * 4);

	}

	@Override
	public void calcolaArea() {
		System.out.println("L'area del quadrato è: " + lato * lato);

	}

}
