package projects.service;

import java.util.List;
import java.util.NoSuchElementException;

import projects.dao.ProjectDao;
import projects.entity.Project;


public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();
	
	// code to ask DAO class to insert a project row.
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}
//Method calls for the project DAO to retrieve all project rows without any details and returns a list of the projects records.
	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}

	//Method calls for project details, and if the project ID is invalid will throw an exception.
	
	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException(
				"Project with project ID=" + projectId + "does not exist."));
	}
	
	
	
	
	
	
	
	
}
