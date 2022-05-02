package com.portfolioAp.pdg.services;



import com.portfolioAp.pdg.model.Project;
import com.portfolioAp.pdg.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pablo
 */

@Service
public class ProjectService implements IProjectService {

    @Autowired
    ProjectRepository projects;

    @Override
    public List<Project> listProjects() {
        return projects.findAll();
    }

    @Override
    public void newProject(Project project) {
        projects.save(project);
    }

    @Override
    public void deleteProject(Long id) {
        projects.deleteById(id);
    }

    @Override
    public Project buscarProject(Long id) {
        return projects.findById(id).orElse(null);
        
    }

    @Override
    public Project editarProject(Long id) {
      throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void editarProject(Project project) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}