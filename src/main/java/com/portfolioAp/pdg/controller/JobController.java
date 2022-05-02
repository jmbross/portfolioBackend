package com.portfolioAp.pdg.controller;

import com.portfolioAp.pdg.model.Job;
import com.portfolioAp.pdg.services.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController

public class JobController {
    
    @Autowired 
    private IJobService trabajo;
        
    @PostMapping ("/new/job")
    public void addJob(@RequestBody Job work){
        trabajo.newJob(work);
    } 
    @GetMapping ("/view/job/{id}")
    @ResponseBody
    public Job verJob(@PathVariable Long id){
     return trabajo.buscarJobs(id);
    }

    /*
    @GetMapping ("/jobs")
    @ResponseBody
    public List<Job> listJobs(){
        return trabajo.listJobs();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPortfolio(@PathVariable Long id){
    trabajo.deleteJob(id);
    }
    */
    /*
    @PutMapping ("/edit/job/{id}")
    public void editJob(@RequestBody Job id){
        trabajo.editarJobs(id);
    }
    */
}