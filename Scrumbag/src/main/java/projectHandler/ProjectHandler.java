package projectHandler;

import java.util.ArrayList;

import databaseManager.ProjectQuerier;
import projectHandler.Task.PRIORITY;

public class ProjectHandler {
	private ProjectQuerier projectQuerier;
	private Task task; 

	public ProjectHandler(ProjectQuerier inProjectQuerier) {
		projectQuerier = inProjectQuerier;
	}

	// FK1, FK7, FK8
	public void createNewTask(int projectID, String taskName, String responsiblePerson, int taskPriority,
			int taskStatus, int expectedTime) {


	}
	
	
	

	// FK2, FK4, FK7, FK8, FK21
	public void editTask(int projectID, int taskID, String taskNAme, String responsiblePerson, int taskPriority,
			int taskStatus, int expectedTime) {

	}
	
	public int getTask(int taskID) {
		Task task = new Task(10, "Scrum Meeting", "Dina", 2, Task.PRIORITY.HIGH, Task.STATUS.NOT_STARTED);
		return task.getTaskID();
	}
	
	public int getProjectID(int projectID) {
		
		return projectID;
	}

	// FK4
	public void setTaskStatus(int projectID, int taskID, int taskStatus) {
	}

	// FK4, FK31
	public void setTaskPriority(int projectID, int taskID, int taskPriority) {

	}

	// FK3
	public void removeTask(int projectID, int taskID) {

	}
	//FK9
	public void updateElapsedTime(int projectID, int taskID, int elapsedTime) {

	}
	//FK11
	public void addUserToProject(int projectID, String username) {

	}
	//FK12
	public void removeUserFromProject(int projectID, String username) {

	}
	//FK13
	public void addMultipleUsersToProject(int projectID, ArrayList<String> userList) {

	}
	//FK14
	public void removeMultipleUsersFromProject(int projectID, ArrayList<String> userList) {

	}
	//FK15,FK16,FK17,FK18
	public ArrayList<Task> getRegisteredTasks(String username) {
		return null;
	}
	//FK19, FK20
	public ArrayList<Task> getSprintTasks(int projectID, int sprintID) {
		return null;

	}



}
