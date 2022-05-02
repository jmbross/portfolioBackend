package com.portfolioAp.pdg.services;


import com.portfolioAp.pdg.model.Skill;
import com.portfolioAp.pdg.repository.SkillRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SkillService implements ISkillService{

    @Autowired
    SkillRepository skillRepo;
    
    @Override
    public List<Skill> listSkills() {
        return skillRepo.findAll();
    }

    @Override
    public void newSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public void editSkill(Long id) {
        skillRepo.save(id);
    }
    
    @Override
    public Skill findSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
    
    
    /*
        @Override
    public Job buscarJobs(Long id) {
        return JobRepo.findById(id).orElse(null);
        //Si no encuentra no devuelve nada
    }
    */
}

