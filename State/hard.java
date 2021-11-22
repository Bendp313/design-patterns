package State;
import java.util.Random;

public class hard implements state {
    private ArithemeticGame game;
    Random r = new Random();

    public hard(ArithemeticGame game){
        this.game = game;
    }
    /**
     * returns a number 1-100
     */
    public int getNum(){
        int ret = r.nextInt(100);
        return ret;
    }
    /**
     * sets the operation to either additon, subtraction, multiplicatoin, or division
     */
    public String getOperation(){
        int op = r.nextInt(4);
        if (op == 1) {
            return "+";
        } 
        else if (op == 2) {
            return "-";
        } 
        else if (op == 3){
            return "*";
        }
        else {
            return "/";
        }
    }
    /**
     * Lets the user know they are doing well
     */
    public void levelUp(){
        System.out.println("You are doing so well!!!");
    }
    /**
     * changes the state from hard to medium
     */
    public void levelDown(){
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getHard());
    }
}