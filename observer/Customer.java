package observer;

import java.util.ArrayList;

/**
 * A class to represent a customer that watches the best sellers list and adds the books to their wish list
 * @author Ben dela Pena
 */
public class Customer implements Observer{
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    /**
     * Creates a customer that watches the best sellers list
     * @param subject the subject being watched by the customer
     * @param firstName customer first name
     * @param lastName  customer last name
     */
    public Customer (Subject subject,String firstName,String lastName){
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        wishList = new ArrayList<>(); 
        subject.registerObserver(this);
    }
    /**
     * adds a book to the customers wish list
     */
    public void update(Book book){
        wishList.add(book);
    }
    /**
     * prints out the wish list 
     */
    public void display(){
        System.out.println("Wish List:");
        for (Book book : wishList){
        System.out.println("- "+book);
    }
    }
}
