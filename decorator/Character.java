package Decorator;

import java.util.ArrayList;
/**
 * A character
 * @author Ben dela Pena
 */
public abstract class Character {
    protected ArrayList<String> sections;
    /**
     * creates a character with an array list of different sections of the character
     */
    public Character(){
        sections = new ArrayList<String>();
    }
    /**
     * prints out every section from the array list to form the character
     */
    public void draw(){
        for (int i=0;i<sections.size();i++){
            System.out.println(sections.get(i));
        }
    }
}
