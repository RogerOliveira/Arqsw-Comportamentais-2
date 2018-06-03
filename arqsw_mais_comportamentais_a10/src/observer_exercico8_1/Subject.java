package observer_exercico8_1;

public interface Subject {

	public void register(ConsomeNoticia connot);

	public void unregister(ConsomeNoticia connot);

	public void notifyObserver();

}
