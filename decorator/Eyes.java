package Decorator;

public class Eyes extends CharacterDecorator{
    /**
     * Sets the character
     * @param character the character to be added on to
     */
    public Eyes(Character character){
        super(character);
    }
    /**
     * adds eyes to the section in the array list
     */
    public void customize(){
        sections.set(3," |  o  o  |"); 
    }
}
