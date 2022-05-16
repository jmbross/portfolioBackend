package com.portfolioAp.pdg.controller;

import com.portfolioAp.pdg.model.Job;
import com.portfolioAp.pdg.model.Mensaje;
import com.portfolioAp.pdg.services.IJobService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/jobs")
@CrossOrigin
@RestController

public class JobController {
    
    @Autowired 
    private IJobService trabajo;

    @GetMapping ("/all")
    @ResponseBody
    public List<Job> listJobs(){
        return trabajo.listJobs();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new")
    public void addJob(@RequestBody Job work){
        trabajo.saveJob(work);
    } 
  
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void borrarJob(@PathVariable Long id){
    trabajo.deleteJob(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody Job job){
      /* 
       - - - - Añadir las comprobaciones necesarias para devolver los estados HTTP que correspondan  - - - -
        
        if(!trabajo.existJobsById(id))
           return new ResponseEntity(new Mensaje("El trabajo solicitado no existe"),HttpStatus.NOT_FOUND);
       if(StringUtils.isBlank(job.getJob_name()))
           return new ResponseEntity(new Mensaje("El nombre del trabajo es obligatorio"),HttpStatus.BAD_REQUEST);
       */
      
      Job trabajo_mod = trabajo.getOne(id).get();
      trabajo_mod.setJob_name(job.getJob_name());
      trabajo_mod.setJob_place(job.getJob_place());
      trabajo.saveJob(trabajo_mod);
      return new ResponseEntity(new Mensaje("El trabajo ha sido actualizado"),HttpStatus.OK);
    }
   
}