
package com.portfolioAp.pdg.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="projects")
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   
    
    public Long project_id;
    public String project_name;
    public String project_description;
    public String project_start;
    public String project_end;

    public Project() {
    }

    public Project(Long project_id, String project_name, String project_description, String project_start, String project_end) {
        this.project_id = project_id;
        this.project_name = project_name;
        this.project_description = project_description;
        this.project_start = project_start;
        this.project_end = project_end;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JsonIgnore()
    @JoinColumn ( name = "portfolio_id")
    
    private Portfolio portfolio;
    
    
    
}
