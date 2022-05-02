package com.portfolioAp.pdg.services;

import com.portfolioAp.pdg.model.Project;
import java.util.List;

/**
 *
 * @author pablo
 */
public interface IProjectService {
    
     
    public List<Project> listProjects();
    public void newProject(Project project);
    public void deleteProject(Long id);
    public Project buscarProject(Long id);    
    public Project editarProject(Long id);
    public void editarProject(Project project);
    
}