public class Todoist {
    Todoist() {

    }
    List<Task> listOfTasks = new List<Task>();
    public List addTask(Task task) {
    	listOfTasks.add(task);
    	return listOfTasks;
    }
    public void print() {
    	for (int i = 0; i < listOfTasks.size(); i++) {
    		System.out.println(listOfTasks.get(i).toString());
    	}
    }
    public void getNextTask(String name) {
    	boolean check = false;
    	for (int i = 0; i < listOfTasks.size(); i++) {
    		if (name.equals(listOfTasks.get(i).getName())) {
    			if(listOfTasks.get(i).getImportant().equals("Important") && listOfTasks.get(i).getUrgent().equals("Not Urgent") && listOfTasks.get(i).getStatus().equals("todo")) {
    				System.out.println(listOfTasks.get(i));
    				check = true;
    				return;
    			} 
    			 
    		}
    	}
    	for (int i = 0; i < listOfTasks.size(); i++) {
    		if(listOfTasks.get(i).getImportant().equals("Important") && listOfTasks.get(i).getUrgent().equals("Urgent") && listOfTasks.get(i).getStatus().equals("todo")) {
    				System.out.println(listOfTasks.get(i));
    				 check = true;
    				return;
    			}
    	}
    	if (check = false) {
    		System.out.println("null");
    	}
    }
    List<Task> tasklist = new List<Task>();
    Task[] tasks = new Task[10];
    public Task[] getNextTask(String name, int count) {
    	for (int i = 0; i < listOfTasks.size(); i++) {
    		if (listOfTasks.get(i).getName().equals(name)) {
    			tasks[i] = listOfTasks.get(i);
    		}
    	}
    	return tasks;
    }
    public int totalTime4Completion() {
    	int count = 0;
    	for (int i = 0; i < listOfTasks.size(); i++) {
    		if (listOfTasks.get(i).getStatus().equals("todo")){
    			count += listOfTasks.get(i).getTime();
    		}
    	}
    	return count;
    }
}