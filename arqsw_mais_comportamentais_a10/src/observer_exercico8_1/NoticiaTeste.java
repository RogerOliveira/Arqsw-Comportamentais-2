package observer_exercico8_1;

public class NoticiaTeste {

	public static void main(String[] args) {
		
		NoticiarioAssina not = new NoticiarioAssina();

		System.out.println(not);
		ObserverNoticia obs = new ObserverNoticia(not);

		not.setTextoNoticia("Greve Caminhoneiros");
		not.setDia(1);
		not.setMes(4);
		not.setTopico("Greve");

		System.out.println(not);

	}

}
