package Iterator;
/**
 * Class that creates a flight
 * @author Ben dela Pena
 */
public class Flight{
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;
    /**
     * sets the information of the flight 
     * @param flightNum flight number
     * @param from where the flight is from
     * @param to the flight destination
     * @param duration how long the flight will take
     * @param transfers how many transfers the flight has
     */
    public Flight (String flightNum, String from, String to, int duration, int transfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }
    public String getFrom(){
        return from;
    }
    public String getTo(){
        return to;
    }
    public int getDuration(){
        return duration;
    }
    public int getNumTransfers(){
        return transfers;
    }
    /**
     * returns all of the information about the flight in a string form
     */
    public String toString(){
        int hours = 0;
        hours = duration/60;
        duration = duration % 60;
        return "Flight Number: "+flightNum+"\nFrom: "+from+"\nTo: "+to+"\nDuration: "+hours+" hours "+duration+" minutes\n"+transfers+" transfers";
    }
}