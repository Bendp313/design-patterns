package observer;

/**
 * Interface for the observers with update and display method
 * @author Ben dela Pena
 */
public interface Observer{
    public void update(Book book);
    public void display();
}
