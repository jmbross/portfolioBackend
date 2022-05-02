package com.portfolioAp.pdg.services;


import com.portfolioAp.pdg.model.Skill;
import java.util.List;

/**
 *
 * @author pablo
 */
public interface ISkillService {
    
    public List<Skill> listSkills();
    public void newSkill(Skill skill);
    public void deleteSkill(Long id);
    public Skill findSkill(Long id);
    public void editSkill(Long id);
   
}