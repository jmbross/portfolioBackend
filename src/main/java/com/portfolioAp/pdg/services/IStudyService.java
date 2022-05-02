package com.portfolioAp.pdg.services;

import com.portfolioAp.pdg.model.Study;


public interface IStudyService {

    public void newStudy(Study studies);
    public Study buscarStudy(Long id);    
    public void deleteStudy(Long id);
    public Study editarJobs(Study studies);
       
}
