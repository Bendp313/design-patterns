package Factory;
/**
 * creates a plan for a Tiny home
 * @author Ben dela Pena
 */
public class TinyHomePlan extends HousePlan{
    /**
     * creates a Tiny home plan with 1 rooms, 5 windows, and 200 square feet
     */
    public TinyHomePlan(){
        super(1,5,200);
    }
    /**
     * adds the required materials to the array list of materials
     */
    protected void setMaterials() {
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing");
        materials.add("Hardware");
    }
    /**
     * adds the required features to the array list of features
     */
    protected void setFeatures() {
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("Multipurpose Areas");
        features.add("Multi-use applications");
    }
    /**
     * prints out the type of house plan and calls the to string from house plan
     */
    public String toString() {
        return "Tiny House\n" + super.toString();
    }
}
