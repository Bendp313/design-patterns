package Factory;

import java.util.ArrayList;
/**
 * A type of house plan
 * @author Ben dela Pena
 */
public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    /**
     * Creates a house plan and creates 2 new arrays for materials and features and sets them based on the type of house plan
     * @param numRooms the number of rooms
     * @param numWindows the number of winsows
     * @param squareFeet the amount of square feet
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet){
        materials = new ArrayList<String>();
        features = new ArrayList<String>();
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        setMaterials();
        setFeatures();
    }
    protected abstract void setMaterials();
    protected abstract void setFeatures();
    /**
     * gets the type of materials
     * @return the materials
     */
    public ArrayList<String> getMaterials(){
        return this.materials;
    }
    /**
     * gets the features 
     * @return the features
     */
    public ArrayList<String> getFeatures(){
        return this.features;
    }
    /**
     * Gets the number of rooms
     * @return the amount of rooms
     */
    public int getNumRooms(){
        return this.numRooms;
    }
    /**
     * gets the number of windows
     * @return the amount of windows
     */
    public int getNumWindows() {
        return this.numWindows;
    }
    /**
     * gets the square feet
     * @return the square feet
     */
    public int getSquareFeet(){
        return this.squareFeet;
    }
    /**
     * returns the square feet, number of rooms and windows, materials, and features
     */
    public String toString() {
        String house = "";
        house += "Square Feet: "+this.squareFeet;
        house += "\nRoom: "+this.numRooms;
        house += "\nWindows "+this.numWindows;
        house += "\n\nMaterials:\n";
        for(String material: materials){
            house += " - "+material+"\n";
        }
        house += "\nFeatures:\n";
        for(String Feature: features){
            house += " - "+Feature+"\n";
        }
        return house;
    }
}
