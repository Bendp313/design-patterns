package Iterator;

import java.util.Iterator;
/**
 * Moves through flight array
 * @author Ben dela Pena
 */
public class FlightIterator implements Iterator{
    private Flight[] flights;
    private int position;

    public FlightIterator(Flight[] flights){
        this.flights = flights;
        position = 0;
    }
    /**
     * checks if the array has more flights left
     * @return booolean true if there is another flight left flase if not
     */
    public boolean hasNext(){
        if(flights[(position)] != null){
            return true;
        }
        else
            return false;
    }
    /**
     * moves the array to the next position
     */
    public Flight next(){
        Flight ret = flights[position];
        position++;
        return ret;

    } 
}
