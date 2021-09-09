package Decorator;

/**
 * A porato head character
 * @author Ben dela Pena
 */
public class PotatoeHead extends Character{
    /**
     * adds 7 sections to the array list to form an empty potato head
     */
    public PotatoeHead(){
        sections.add(" ");
        sections.add("    ____");
        sections.add("  /      \\");
        sections.add(" |        |");
        sections.add(" |        |");
        sections.add("  \\      /");
        sections.add("   \\____/");
    }
}
