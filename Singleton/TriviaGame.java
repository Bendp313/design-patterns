/**
 * author Ben dela Pena
 * A trivia game
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TriviaGame {
    private static TriviaGame triviagame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;
    
    /**
     * initializes random and the scanner, fills the quesiton array from DataLoader,sets the score to 0 anr prints a welcome message
     */
    private TriviaGame(){
        rand = new Random();
        reader = new Scanner(System.in);
        questions = DataLoader.getTriviaQuestions();
        score = 0;
        System.out.println("Wekcome to the Trivia Game!\n");
    }
    /**
     * creates an instance of the trivia game
     * @return the trivia game
     */
    public static TriviaGame getInstance(){
        triviagame = new TriviaGame();
        return triviagame;
    }
    /**
     * Asks the user if they want to play the trivia game by pressing "P" or quiting with "Q"
     * if neither is entered then they are asked again
     */
    public void play(){
        boolean play = true;
        while(play){
            System.out.println("(P)lay or (Q)uit?");
            String quit = reader.nextLine();
            if (quit.equalsIgnoreCase("P")){
                playRound();
            }
            else if(quit.equalsIgnoreCase("Q")){
                System.out.println("\nYou won "+score+" Games\nGoodbye");
                play = false;
            }
            else{
                System.out.println("Error: Enter \"P\" or \"Q\"");
            }
            reader.nextLine();
        }
    }
    /**
     * prints out a random question with answers and asks the user to enter the answer
     * If the answer isn't valid then the user is given an error
     * if the answer is correct then they are told and their score goes up 1 and the method returns true
     * if the answer is incorrect then they are told the correct answer and the method returns false
     * @return true if correct false if incorrect
     */
    private boolean playRound(){
        Question question = questions.get(rand.nextInt(10));
        System.out.println(question);
        System.out.println("Enter Answer: ");
        int answer = reader.nextInt();
        if (answer > 4 || answer < 1){
            System.out.println("error");
            return false;
        }
        else if (question.isCorrect(answer)){
            System.out.println("That's correct");
            score++;
            return true;
        }
        else if(!question.isCorrect(answer)){
            System.out.println("That is wrong\nThe correct answer is "+question.getCorrectAnswer());
            return false;
        }
        return false;
    }
}
