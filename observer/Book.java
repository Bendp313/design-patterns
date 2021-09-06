package observer;

/**
 * A book
 * @author Ben dela Pena
 */
public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;

    /**
     * Creates a Book 
     * @param title the title of the book
     * @param authorFirstName the author of the books first name
     * @param authorLastName the author of the books last name
     */
    public Book (String title,String authorFirstName,String authorLastName){
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    /**
     * gets the title of the book
     * @return the String title of the book
     */
    public String getTitle(){
        return this.title;
    }
    /**
     * gets the authors first name
     * @return the string of the authors first name
     */
    public String getAuthorFirstName(){
        return this.authorFirstName;
    }
     /**
     * gets the authors first name
     * @return the string of the authors last name
     */
    public String getAuthorLastName(){
        return this.authorLastName;
    }
    /**
     * Prints out the title of the book and who it is by
     * @return A string of the title and the authors name
     */
    public String toString(){
        return this.title+" by: "+this.authorFirstName+" "+this.authorLastName;
    }
}
