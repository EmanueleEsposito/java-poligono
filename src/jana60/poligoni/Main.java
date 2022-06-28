package jana60.poligoni;

public class Main {

	public static void main(String[] args) throws Exception {
		try {
			Poligono quadrato = new Quadrato(10);
			quadrato.calcolaPerimetro();
			quadrato.calcolaArea();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			Poligono rettangolo = new Rettangolo(5, 27);
			rettangolo.calcolaPerimetro();
			rettangolo.calcolaArea();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
