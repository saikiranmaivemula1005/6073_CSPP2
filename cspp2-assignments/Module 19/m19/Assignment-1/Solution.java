import java.util.Scanner;
import java.util.Arrays;

/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    static String[] questionArray = new String[100];
    static int questionCounter = 0;
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        for (int i = 0; i < questionCount; i++) {
       	String line = s.nextLine();
       	String[] tokens = line.split(":");
       	// System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2] + " " + tokens[3] + " " + tokens[4]);
       	questionArray = tokens;
       }
       questionCounter = questionCount;
        if (questionCount == 0) {
        	System.out.println("Quiz does not have questions");
        	return;
        }
        if (questionCount == 1) {
        	System.out.println("Error! Malformed question");
        	return;
        }
        System.out.println(questionCount + " are added to the quiz");
    }
    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    static int answerCounter = 0;
    final static int three = 3;
    static String[] answersArray = new String[100];
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        if (questionCounter == 1) {
        	return;
        }
        String[] newArray = questionArray[1].split(",");
        for (int k = 0; k < questionCounter; k++) {
        	System.out.println("question text" + " " + (k + 1) + "(" + (k + 1) + ")" );
        	System.out.println(newArray[0] + "	" +newArray[1] + "	" + newArray[2] + "	" + newArray[three]);
        	System.out.println();
        }
        for (int j = 0; j < answerCount; j++) {
       	String line = s.nextLine();
       	String[] tokens = line.split(" ");
       	answersArray = tokens;
       	// System.out.println(tokens[0] + " " + tokens[1]);
       }
       answerCounter = answerCount;
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
        for (int i = 0; i < questionCounter; i++) {
        	System.out.println(questionArray[0]);
        }
    }
}
/**
 * Class for quiz.
 */
class Quiz {
	 private String question;
}
