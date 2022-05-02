package com.portfolioAp.pdg.services;

import com.portfolioAp.pdg.model.Study;
import com.portfolioAp.pdg.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudyService implements IStudyService {

     @Autowired
    StudyRepository studyRepo;
    
    @Override
    public void newStudy(Study studies) {
        studyRepo.save(studies);
    }

    @Override
    public Study buscarStudy(Long id) {
        return studyRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteStudy(Long id) {
        studyRepo.deleteById(id);
    }

    @Override
    public Study editarJobs(Study studies) {
        return studyRepo.save(studies);
    }

}
