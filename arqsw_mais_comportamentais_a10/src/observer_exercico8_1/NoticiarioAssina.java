package observer_exercico8_1;

import java.util.ArrayList;

public class NoticiarioAssina implements Subject {

	public ArrayList<ConsomeNoticia> array;
	String textoNoticia;
	int dia;
	int mes;
	String topico;

	@Override
	public void register(ConsomeNoticia connot) {
		System.out.println(connot);
		array.add(connot);

	}

	public String getTopico() {
		return topico;
	}

	public void setTopico(String topico) {
		this.topico = topico;
	}

	@Override
	public void unregister(ConsomeNoticia connot) {
		int NoticiarioIndex = array.indexOf(connot);

		System.out.println("Parei de olhar" + (NoticiarioIndex + 1));
		array.remove(NoticiarioIndex);
	}

	@Override
	public void notifyObserver() {
		for (ConsomeNoticia not : array) {
			not.notificaNoticia(textoNoticia, dia, dia, textoNoticia);

		}

	}

	public ArrayList<ConsomeNoticia> getArray() {
		return array;
	}

	public void setArray(ArrayList<ConsomeNoticia> array) {
		this.array = array;
	}

	public String getTextoNoticia() {
		return textoNoticia;
	}

	public void setTextoNoticia(String textoNoticia) {
		this.textoNoticia = textoNoticia;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

}
