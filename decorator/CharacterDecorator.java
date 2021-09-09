package Decorator;

import java.util.ArrayList;
/**
 * Adds to a character
 * @author Ben dela Pena
 */
public abstract class CharacterDecorator extends Character{
    protected Character characters;
    /**
     * Creates an empty array list of sections and copies the character to customize then customizes
     * @param character character to be added to
     */
    public CharacterDecorator(Character character){
        this.sections = new ArrayList<String>();
        for (int i=0;i<character.sections.size();i++){
            this.sections.add(character.sections.get(i));
        } 
        customize();
    }
    /**
     * adds to the character
     */
    public abstract void customize();
}
