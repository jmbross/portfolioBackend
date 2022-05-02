/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioAp.pdg.controller;
/**
 *
 * @author pablo
 */


import com.portfolioAp.pdg.model.Skill;
import com.portfolioAp.pdg.services.ISkillService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pablo
 */

@RestController

public class SkillController {
   
    @Autowired
    private ISkillService skills;
    
    @PostMapping("/new/skill")
    public void addSkill(@RequestBody Skill skill){
        skills.newSkill(skill);
    }
    
    @GetMapping("/view/skill/{id}")
    @ResponseBody
    public Skill findSkills(@PathVariable Long id){
        return skills.findSkill(id);
    }
}
