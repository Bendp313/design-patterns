package State;
import java.util.Random;

public class easy implements state {
    private ArithemeticGame game;
    Random r = new Random();

    public easy(ArithemeticGame game){
        this.game = game;
    }
    /**
     * gets a random numer 1-10
     */
    public int getNum(){
        int ret = r.nextInt(10);
        return ret;
    }
    /**
     * set the operation to either addition or subtraction
     */
    public String getOperation(){
        int op = r.nextInt(2);
        if (op == 1){
            return "+";
        }
        else {
            return "-";
        }
    }
    /**
     * changes the state from easy to medium
     */
    public void levelUp(){
        System.out.println("You've been advanced to medium mode.");
        game.setState(game.getMedium());
    }
    /**
     * lets the user know they are doing badly
     */
    public void levelDown(){
        System.out.println("You seem to be struggling, you may want to study");
    }
}