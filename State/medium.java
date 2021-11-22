package State;
import java.util.Random;

public class medium implements state {
    private ArithemeticGame game;
    Random r = new Random();

    public medium(ArithemeticGame game){
        this.game = game;
    }
    /**
     * returns a number 1-50
     */
    public int getNum(){
        int ret = r.nextInt(50);
        return ret;
    }
    /**
     * sets the operatoin to either addition, subtraction, or multiplication
     */
    public String getOperation(){
        int op = r.nextInt(3);
        if (op == 1){
            return "+";
        }
        else if (op == 2){
            return "-";
        }
        else {
            return "*";
        }
    }
    /**
     * changes the game from medium to hard
     */
    public void levelUp(){
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHard());
    }
    /**
     * changes the game from medium to easy
     */
    public void levelDown(){
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasy());
    }
}