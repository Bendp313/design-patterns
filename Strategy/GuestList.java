package Strategy;

import java.util.ArrayList;

public class GuestList {
    private String title;
    private ArrayList<String> people = new ArrayList<String>();
    private SearchBehavior searchBehavior;

    public GuestList (String title){
        this.title = title;
        setSearchBehavior(null);
    }
    public boolean add (String person){
        if (this.searchBehavior.contains(people,person)){
            return false;
        }
        else {
            people.add(person);
            return true;
        }
    }

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
    public String getTitle(){
        return this.title;
    }

    public void setSearchBehavior(SearchBehavior searchB){
        if (searchB != null){
            this.searchBehavior = searchB;
        }
        else {
        this.searchBehavior = new LinearSearch();}
    }

    public ArrayList<String> getList(){
        return this.people;
    }
}
