package Strategy;

import java.util.ArrayList;
public class LinearSearch implements SearchBehavior{
    
    public boolean contains(ArrayList<String> data, String item) {
        for (int i=0;i<data.size();i++){
            if (item.equalsIgnoreCase(data.get(i))) {
                return true;
            }
        }
        return false;
    }
}
