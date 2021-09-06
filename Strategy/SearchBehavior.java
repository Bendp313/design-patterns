package Strategy;

import java.util.ArrayList;
/**
 * Search behavior interface
 * @author Ben dela Pena
 */
public interface SearchBehavior {
    /**
     * Checks if the indicated person is already in the guest list
     * @param data The guest list of people
     * @param item The name of the Person
     * @return True or false if the person is found or not
     */
    public boolean contains(ArrayList<String> data, String item);
}
