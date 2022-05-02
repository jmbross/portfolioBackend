package com.portfolioAp.pdg.services;


import com.portfolioAp.pdg.model.Job;
import com.portfolioAp.pdg.repository.JobsRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService implements IJobService {

    @Autowired
    JobsRepository JobRepo;
    
    @Override
    public List<Job> listJobs() {
        return JobRepo.findAll();
    }

    @Override
    public void newJob(Job trabajo) {
        JobRepo.save(trabajo);
    }

    @Override
    public void deleteJob(Long id) {
        JobRepo.deleteById(id);
    }

    @Override
    public Job buscarJobs(Long id) {
        return JobRepo.findById(id).orElse(null);
        //Si no encuentra no devuelve nada
    }

    @Override
    public Job editarJobs(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
}
