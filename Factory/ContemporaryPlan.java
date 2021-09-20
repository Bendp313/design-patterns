package Factory;
/**
 * Creates a plan for a contemporary home
 * @author Ben dela Pena
 */
public class ContemporaryPlan extends HousePlan {
    /**
     * creates a contemporary home with 5 rooms, 40 windows, and 3000 square feet
     */
    public ContemporaryPlan(){
        super(5,40,3000);
    }
    /**
     * adds the required materials to the array list of materials
     */
    protected void setMaterials() {
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");
    }
    /**
     * adds the required features to the array list of features
     */
    protected void setFeatures() {
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");
    }
    /**
     * prints out the type of house plan and calls the to string from house plan
     */
    public String toString() {
        return "Contemporary Home\n" + super.toString();
    }
}
