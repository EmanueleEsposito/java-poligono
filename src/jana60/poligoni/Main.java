package jana60.poligoni;

public class Main {

	public static void main(String[] args) {

		Poligono quadrato = new Quadrato(10);
		quadrato.calcolaPerimetro();
		quadrato.calcolaArea();
		Poligono rettangolo = new Rettangolo(5, 27);
		rettangolo.calcolaPerimetro();
		rettangolo.calcolaArea();

	}

}
