package Strategy;

import java.util.ArrayList;
/**
 * A Guest list
 * @author Ben dela Pena
 */
public class GuestList {
    private String title;
    private ArrayList<String> people = new ArrayList<String>();
    private SearchBehavior searchBehavior;

    /**
     * Creates a guest list with an empty search behavior
     * @param title name of the guest list
     */
    public GuestList (String title){
        this.title = title;
        setSearchBehavior(null);
    }
    /**
     * Adds a person to the guset list
     * @param person The name to be added
     * @return true or false if the person as added or not
     */
    public boolean add (String person){
        if (this.searchBehavior.contains(people,person)){
            return false;
        }
        else {
            people.add(person);
            return true;
        }
    }
    /**
     * removes a person from the guest list
     * @param person The name to be removed
     * @return true or false if the person was removed or not
     */
    public boolean remove (String person){
        if (this.searchBehavior.contains(people,person)){
            people.remove(person);
            return true;
        }
        else {
            people.remove(person);
            return false;
        }
    }
    /**
     * gets the Title of the guest list
     * @return A string representation of the title of the guest list
     */
    public String getTitle(){
        return this.title;
    }
    /**
     * sets the search behavior for the guest list if null Linear search is used
     * @param searchB The type of search to be used either Binary or Linear
     */
    public void setSearchBehavior(SearchBehavior searchB){
        if (searchB != null){
            this.searchBehavior = searchB;
        }
        else {
        this.searchBehavior = new LinearSearch();}
    }
    /**
     * Gets the guest list
     * @return ArrayList of string representations of the names of the people
     */
    public ArrayList<String> getList(){
        return this.people;
    }
}
