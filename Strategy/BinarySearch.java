package Strategy;

import java.util.ArrayList;
import java.util.Collections;
public class BinarySearch implements SearchBehavior {
    /** 
     * Checks if the indicated person is already in the guest list using a binary search and sorts in alphabetical order
     * @param data The guest list of people
     * @param item The name of the person to find
     * @return True or false if the person is found or not
     * reference : https://www.geeksforgeeks.org/binary-search-a-string/
     */
    public boolean contains(ArrayList<String> data, String item) {
        Collections.sort(data);
        int left = 0; 
        int right = (data.size() -1);
        while (left <= right){
            int i = (left + right)/2;
            int check = item.compareToIgnoreCase(data.get(i));
            if(check == 0)
                return true;
            else if(check > 0)
            left = i+1;
            else 
            right = i-1;
        }
        return false;
        
    }
    
}
