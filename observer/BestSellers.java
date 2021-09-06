package observer;

import java.util.ArrayList;

/**
 * The bestSellers list of books
 * @author Ben dela Pena
 */
public class BestSellers implements Subject{
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Creates and array of observers and of best selling books
     */
    public BestSellers(){
        observers = new ArrayList<>();
        bestSellers = new ArrayList<>();
    }
    /**
     * adds an observer to the array lsit of observers
     * @param observer The observer to be added
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    /**
     * removes an observer to the array list of observers
     * @param observer The observer to be removed
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    /**
     * Lets the observers know when 
     * @param book The book added to best sellers list
     */
    public void notifyObserver(Book book){
        for (Observer observer : observers){
            observer.update(book);
        }
    }
    /**
     * adds book to best sellers list
     * @param book book to be added to best sellers list
     */
    public void addBook(Book book){
        bestSellers.add(book);
        notifyObserver(book);
    }
}
