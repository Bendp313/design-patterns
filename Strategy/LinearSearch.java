package Strategy;

import java.util.ArrayList;
/**
 * A linear search 
 * @author Ben dela Pena
 */
public class LinearSearch implements SearchBehavior{
    /** 
     * Checks if the indicated person is already in the guest list using a linear search
     * @param data The guest list of people
     * @param item The name of the person to find
     * @return True or false if the person is found
     */
    public boolean contains(ArrayList<String> data, String item) {
        for (int i=0;i<data.size();i++){
            if (item.equalsIgnoreCase(data.get(i))) {
                return true;
            }
        }
        return false;
    }
}
