package com.portfolioAp.pdg.controller;

import com.portfolioAp.pdg.model.Study;
import com.portfolioAp.pdg.services.IStudyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudyController {
    
    @Autowired 
    private IStudyService study;
        
    @PostMapping ("/new/studies")
    public void addStudies(@RequestBody Study studies){
        study.newStudy(studies);
    } 
    @GetMapping ("/view/studies/{id}")
    @ResponseBody
    public Study verStudies(@PathVariable Long id){
     return study.buscarStudy(id);
    }
}
