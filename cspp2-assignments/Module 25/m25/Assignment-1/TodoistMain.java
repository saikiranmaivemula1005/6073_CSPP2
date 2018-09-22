import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for task.
 */
class Task {
    /**
     * title of task.
     */
    private String title;
    /**
     * name of the person.
     */
    private String name;
    /**
     * time for task.
     */
    private int time;
    /**
     * variable for importance of task.
     */
    private boolean important;
    /**
     * variable for urgency of task.
     */
    private boolean urgency;
    /**
     * variable for status of task.
     */
    private String status;
    /**
     * Constructor for class task.
     *
     * @param      title      The title
     * @param      name       The name
     * @param      time       The time
     * @param      important  The important
     * @param      urgency    The urgency
     * @param      status     The status
     */
    Task(final String title, final String name, final int time,
     final boolean important, final boolean urgency,
      final String status) throws Exception{
        this.title = title;
        this.name = name;
        this.important = important;
        this.time = time;
        this.urgency = urgency;
        this.status = status;
        try {

        if (title.length() == 0) {
            throw new Exception("Title not provided");
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        try {
            if (time < 0) {
                throw new Exception ("Invalid timeToComplete");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " " + time);
            System.exit(1);
        }
        final int four = 4;
        try {
            if (status.length() != four) {
                throw new Exception("Invalid status");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " " + status);
            System.exit(1);
        }
    }
    /**
     * Gets the title.
     *
     * @return     The title.
     */
    public String getTitle() {
        return title;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return name;
    }
    /**
     * Gets the time.
     *
     * @return     The time.
     */
    public int getTime() {
        return time;
    }
    /**
     * Gets the importantance of task.
     *
     * @return     The important.
     */
    public String getImportant() {
       if (important) {
        return "Important";
       }
       return "Not Important";
    }
    /**
     * Gets the urgency of task.
     *
     * @return     The urgent.
     */
    public String getUrgent() {
        if (urgency) {
            return "Urgent";
        }
        return "Not Urgent";
    }
    /**
     * Gets the status of the task.
     *
     * @return     The status.
     */
    public String getStatus() {
        return status;
    }
    /**
     * Returns a string representation of the task.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return getTitle() + ", " + getName()  + ", " + getTime()  + ", "
         + getImportant()  + ", " + getUrgent()  + ", " + getStatus();
    }
}
/**
 * Class for todoist main.
 */
public class TodoistMain {
    /**
     * Constructs the object.
     */
    TodoistMain() {

    }

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                case "add-task":
                    testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    todo.print();
                break;
                case "get-next":
                    todo.getNextTask(tokens[1]);
                break;
                case "get-next-n":
                    int n = Integer.parseInt(tokens[2]);
                    Task[] tasks = todo.getNextTask(tokens[1], n);
                    System.out.println(Arrays.deepToString(tasks));
                break;
                case "total-time":
                    System.out.println(todo.totalTime4Completion());
                break;
                default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        final int six = 6, five = 5, four = 4, three = 3;
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[three]);
        boolean important = tokens[four].equals("y");
        boolean urgent = tokens[five].equals("y");
        String status = tokens[six];
        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
