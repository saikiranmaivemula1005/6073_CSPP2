public class Todoist {
    Todoist() {

    }
    List<Task> listOfTasks = new List<Task>();
    public List addTask(Task task) {
    	listOfTasks.add(task);
    	return listOfTasks;
    }
}