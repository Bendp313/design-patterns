package State;
/**
 * @author Ben dela Pena
 * The artithmetic game
 */
import java.util.Scanner;

public class ArithemeticGame {
    private state easy;
    private state medium;
    private state hard;
    private state state;
    private int score;
    private Scanner reader;

    /**
     * creates the game and sets the state to easy
     */
    public ArithemeticGame(){
        easy = new easy(this);
        medium = new medium(this);
        hard = new hard(this);
        state = easy;
        reader = new Scanner(System.in);
    }
    /**
     * asks the queston and tell the user if they are correct or not
     */
    public void pressQuestionButton(){
        int num1 = state.getNum();
        int num2 = state.getNum();
        String op = state.getOperation();
        int ans = 0;
        if (op.equals("+")){
            ans = num1 + num2;
        }
        else if (op.equals("-")){
            ans = num1 - num2;
        }
        else if (op.equals("*")) {
            ans = num1 * num2;
        }
        else if (op.equals("/")) {
            ans = num1 / num2;
        }
        System.out.println(num1 + " " + op + " " + num2);
        int userAns = reader.nextInt();
            if (userAns == ans) {
                System.out.println("correct");
                score++;
            }
            else {
                System.out.println("incorrect");
                score--;
            }
            if (score >= 3){
                score = 0;
                state.levelUp();
            }
            if (score <= -3){
                score = 0;
                state.levelDown();
            }
        }
     /**
    * changes the state of the game
    * @param state the state to change to
    */
    public void setState(state state){
        this.state = state;
    }
    /**
     * gets the easy state of the game
     * @return the easy state
     */
    public state getEasy(){
        return this.easy;
    }
    /**
     * gets the medium state of the game
     * @return the medium state
     */
    public state getMedium(){
        return this.medium;
    }
    /**
     * gets the hard state of the game
     * @return the hard state
     */
    public state getHard(){
        return this.hard;
    }
}
