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
     * @throws Exception throws exceptions.
     */
    Task(final String title, final String name, final int time,
     final boolean important, final boolean urgency,
      final String status) throws Exception {
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
                throw new Exception("Invalid timeToComplete");
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