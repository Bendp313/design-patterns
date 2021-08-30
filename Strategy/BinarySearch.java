package Strategy;

import java.util.ArrayList;
import java.util.Collections;
public class BinarySearch implements SearchBehavior {

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
