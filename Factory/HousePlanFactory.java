package Factory;
/**
 * @author Ben dela Pena
 * Method that creates the house plan
 */
public class HousePlanFactory{
    /**
     * Creates a type of house plan based on a string that is taken in
     * @param type House plan the user wants
     * @return a type of House Plan
     */
    public static HousePlan createHousePlan(String type){
        if(type.equalsIgnoreCase("log cabin")){
            return new LogCabinPlan();
        }
        else if(type.equalsIgnoreCase("tiny home")){
            return new TinyHomePlan();
        }
        else if (type.equalsIgnoreCase("contemporary home")){
            return new ContemporaryPlan();
        }
        else
            return null;
    }
}