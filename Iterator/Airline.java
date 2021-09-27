package Iterator;
/**
 * Creates an airline with different flights
 * @author Ben dela Pena
 */
public class Airline {
    private String title;
    private Flight[] flights;
    private int size;
    /**
     * Creates an instance of an airline with a flight array size set to 2
     * @param title name of the airline
     */
    public Airline(String title){
        this.title = title;
        size = 0;
        flights = new Flight[2];
    }
    /**
     * Adds a flight to the airline's flight array. If the array is full then it is sent to growArray method. The integer size keeps track of flights in the array
     * @param flightNum the flight number
     * @param from where the flight is from
     * @param to where the flight is goin
     * @param duration the time length of the flight
     * @param transfers the amount of transfers the flight has
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers){
        if (size < flights.length){
            flights[size] = new Flight (flightNum, from, to, duration, transfers);
            size++;
        }
        else if (size == flights.length){
            flights = growArray(flights);
            flights[size] = new Flight(flightNum, from, to, duration, transfers);
            size++;
        }
    }
    public String getTitle(){
        return title;
    }
    /**
     * Creates a new flight array with double the length of the array passed in then copies the data to the new array.
     * @param flights the old array whose length needs to be doubled
     * @return flights2 the new array with the length doubled
     */
    private Flight[] growArray(Flight[] flights){
        Flight[] flights2 = new Flight[2*flights.length];
        for (int i=0;i<flights.length;i++){
            flights2[i] = flights[i];
        }
        return flights2;
    }
    /**
     * Creates and returns a Flight iterator
     * @return flightIterator 
     */
    public FlightIterator createIterator(){
        FlightIterator flightIterator = new FlightIterator(flights);
        return flightIterator;
    }
}
