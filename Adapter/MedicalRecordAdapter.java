package Adapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * Adapts a health record to a medical record
 * @author ben dela Pena
 */
public class MedicalRecordAdapter implements MedicalRecord{
    private HealthRecord record;

    /**
     * sets the Health record passed in to the health record in this class
     * @param record
     */
    public MedicalRecordAdapter(HealthRecord record){
        this.record = record;
    }
    /**
     * gets the first name
     * @return first name
     */
    public String getFirstName(){
        String name = record.getName();
        String[] splitStr = name.split(" ");
        return splitStr[0];
    }
    /**
     * gets the last name
     * @return last name
     */
    public String getLastName(){
        String name = record.getName();
        String[] splitStr = name.split(" ");
        return splitStr[1];
    }
    /**
     * gets the patients birhtday
     * @return the birthday
     */
    public Date getBirthday() {
        Date dB = record.getBirthdate();
        return dB;
    }
    /**
     * gets the birthday in a string format
     * @param birthday patient birthday
     * @return string format birthday
     */
    private String getFormattedBirthday(Date birthday){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return simpleDateFormat.format(birthday);
    }
    /**
     * turns string gender into a object gender
     * @return gender
     */
    public Gender getGender(){
        String gen = record.getGender().toUpperCase();
        Gender gender = Enum.valueOf(Gender.class, gen);
        return gender;
    }
    /**
     * adds a vist to the history
     * @param date date of visit
     * @param well sick or well visit
     * @param description description of visit
     */
    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    }
    /**
     * makes a date from 3 ints
     * @param year the year
     * @param month the month
     * @param day the day
     * @return Date format of a date
     */
    private Date makeDate(int year, int month, int day) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
        return myCalendar.getTime();
    }
    /**
     * parses through the history to turn it into a visit and add to an array list of visits
     */
    public ArrayList<Visit> getVisitHistory() {
        ArrayList<Visit> visits = new ArrayList<>();
        for (String visit : record.getHistory()){
            String[] splitStr = visit.split("\n");
            String[] dateS = splitStr[0].split(": ");
            String[] wellS = splitStr[1].split(": ");
            String[] commentS = splitStr[2].split(": ");
            dateS[1] = dateS[1].substring(4);
            dateS = dateS[1].split(", ");
            int year = Integer.parseInt(dateS[2]);
            int month = Integer.parseInt(dateS[1]);
            int day = Integer.parseInt(dateS[0]);
            Date date = makeDate(year, month, day);
            boolean well = Boolean.parseBoolean(wellS[1]);
            String description = commentS[1];
            visits.add(new Visit(date, well, description));
        }
        return visits;
    }
    /**
     * prints out as a string
     */
    public String toString(){
        String result = "***** " + getFirstName() + " " + getLastName() + " *****\n";
        result += "Birthday: " + getFormattedBirthday(getBirthday()) + "\n";
        result += "Gender: " + getGender() + "\n";
        result += "Medical Visit History: \n";

        if (record.getHistory().size() == 0) {
            result += "No visits yet";
        } else {
            for (Visit visit : getVisitHistory()) {
                result += visit.toString() + "\n";
            }
        }

        return result;
    }
}