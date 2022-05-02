package com.portfolioAp.pdg.services;

import com.portfolioAp.pdg.model.Job;
import java.util.List;

public interface IJobService {
 
    public List<Job> listJobs();
    public void newJob(Job work);
    public void deleteJob(Long id);
    public Job buscarJobs(Long id);    
    public Job editarJobs(Long id);
    
}
