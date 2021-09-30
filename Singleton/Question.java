/**
 * @author Ben dela Pena
 * a Question
 */
public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    /**
     * creates a question with its answer choices and correct answer
     * @param question the question asked
     * @param ans1 answer 1
     * @param ans2 answer 2
     * @param ans3 answer 3
     * @param ans4 answer 4
     * @param correctAnswer the correct answer 0 based
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
        this.question = question;
        answers = new String[4];
        this.answers[0] = ans1;
        this.answers[1] = ans2;
        this.answers[2] = ans3;
        this.answers[3] = ans4;
        this.correctAnswer = correctAnswer;
    }
    /**
     * prints out the question with its answer choices
     * @return a string of the question with its answer choices 
     */
    public String toString(){
        return question+"\n\n1. "+answers[0]+"\n2. "+answers[1]+"\n3. "+answers[2]+"\n4. "+answers[3];
    }
    /**
     * Comapres the answer the user input to the correct answer + 1 since the correct answer starts at 0 and the users starts at 1
     * @param userAnswer what the user input
     * @return true or false if the answer is correct or not
     */
    public boolean isCorrect(int userAnswer){
        if (userAnswer == correctAnswer+1){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * prints out the correct answer
     * @return the point in the array at the correct answer
     */
    public String getCorrectAnswer(){
        return (answers[this.correctAnswer]);
    }
}
