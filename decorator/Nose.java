package Decorator;
/**
 * An add on of a nose
 * @author Ben dela Pena
 */
public class Nose extends CharacterDecorator{
    /**
     * Sets the character
     * @param character the character to be added on to
     */
    public Nose (Character character){
        super(character);
    }
    /**
     * adds a nose to the section in the array list at index 4
     */
    public void customize(){
        sections.set(4," |   >    |");
    }
}
