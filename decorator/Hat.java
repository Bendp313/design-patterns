package Decorator;
/**
 * An add on of a hat
 * @author Ben dela Pena
 */
public class Hat extends CharacterDecorator{
    /**
     * Sets the character
     * @param character the character to be added on to
     */
    public Hat (Character character){
        super (character);
    }
     /**
     * adds a hat to the sections in the array lists at index 0 and 1
     */
    public void customize(){
        sections.set(0,"    ____"); 
        sections.set(1," __|____|____"); 
    }
}
