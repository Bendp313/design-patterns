package observer;

/**
 * interface for subjects that registers, removes, and notifies observers
 * @author Ben dela Pena
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver(Book book);
}
