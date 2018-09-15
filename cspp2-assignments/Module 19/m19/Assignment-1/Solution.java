import java.util.Scanner;

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
        QuizImplementation q = new QuizImplementation();
        Quiz quiz = new Quiz();
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
                q.loadQuestions(s, quiz, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                q.startQuiz(s, quiz, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                q.displayScore(quiz);
                break;
                default:
                break;
            }
        }
    }
}
    class Quiz {
    	private String question;
    	private String choice;
    	private String answer;
    	private int maximumMarks;
    	private int penaltyMarks;
    	Quiz() {
    		
    	}
    	Quiz(String question, String choice, String answer, int maximumMarks, int penaltyMarks) {
    		this.question = question;
    		this.choice = choice;
    		this.answer = answer;
    		this.maximumMarks = maximumMarks;
    		this.penaltyMarks = penaltyMarks;

    	}
    	public String getQuestion() {
    		return this.question;
    	}
    	public String getChoice() {
    		return this.choice;
    	}
    	public String getAnswer() {
    		return this.answer;
    	}
    	public int getMaximumMarks() {
    		return this.maximumMarks;
    	}
    	public int getPenaltyMarks() {
    		return this.penaltyMarks;
    	}

    }
    class QuizImplementation {
    static List<Quiz> quizObject = new List<Quiz>();
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
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
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        for (int i = 0; i < answerCount; i++) {
        	System.out.println(quizObject.get(i).getQuestion());
        }
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
    }
}
