package jana60.poligoni;

public class Quadrato implements Poligono {
	// Attributi
	private int lato;
	// Costruttore

	public Quadrato(int lato) throws Exception {
		super();
		if (lato <= 0) {
			System.out.println("Errore il valore del lato non può essere uguale o minore di zero");
		}
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
