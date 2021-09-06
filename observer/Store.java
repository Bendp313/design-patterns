package observer;

import java.util.*;
/**
 * A class that implements observer that watches the best sellers list and adds them to a queue of 5
 * @author Ben dela Pena
 */
public class Store implements Observer{
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers = new LinkedList<>();

    /**
     * Creates a store that watches the best sellers list
     * @param subject The subject being watched by the store
     */
    public Store(Subject subject){
        this.subject = subject;
        this.title = title;
        subject.registerObserver(this);
    }
    /**
     * updates the queue of best sellers and removes the oldest book to keep only 5 best sellers
     * @param book
     */
    public void update(Book book){
        if (bestSellers.size()>=5){
            bestSellers.remove();
            bestSellers.add(book);
        }
        else{
            bestSellers.add(book);
        }
    }
    /**
     * prints out the top 5 best sellers
     */
    public void display(){
        System.out.println("Top 5 Best Sellers:");
        for( Book book : bestSellers){
            System.out.println("- "+book);
        }
    }
}
