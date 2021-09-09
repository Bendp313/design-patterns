package Decorator;
/**
 * An add on of a mouth
 * @author Ben dela Pena
 */
public class Mouth extends CharacterDecorator{
    /**
     * Sets the character
     * @param character the character to be added on to
     */
    public Mouth (Character character){
        super(character);
    }
    /**
     * adds a mouth to the section in the array list at index 5
     */
    public void customize(){
        sections.set(5,"  \\ ---- /");
    }
}
