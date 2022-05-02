/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioAp.pdg.controller;

import com.portfolioAp.pdg.model.Project;
import com.portfolioAp.pdg.services.IProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProjectController {

    private IProjectService project;
    
    @PostMapping ("/new/project")
    public void addProject(@RequestBody Project projects){
        project.newProject(projects);
    } 
    @GetMapping ("/view/project/{id}")
    @ResponseBody
    public Project verProject (@PathVariable Long id){
        return project.buscarProject(id);
    }  
}
