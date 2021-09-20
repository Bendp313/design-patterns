package Factory;
/**
 * Creates a plan for a log cabin
 * @author Ben dela Pena
 */
public class LogCabinPlan extends HousePlan{
    /**
     * creates a log cabin house plan with 2 rooms, 10 windows, and 1800 square feet
     */
    public LogCabinPlan(){
        super(2, 10, 1800);
    }
    /**
     * adds the required materials to the array list of materials
     */
    protected void setMaterials(){
        materials.add("Log Sliding");
        materials.add("Board and Batten Sliding");
        materials.add("White Pine");
    }
    /**
     * adds the required features to the array list of features
     */
    protected void setFeatures(){
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }
    /**
     * prints out the type of house plan and calls the to string from house plan
     */
    public String toString(){
        return "Log Cabin\n"+super.toString();
    }
}
