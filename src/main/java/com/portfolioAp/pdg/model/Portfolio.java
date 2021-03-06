package com.portfolioAp.pdg.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="portfolio")
@Getter @Setter
public class Portfolio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="portfolio_id")
    public Long id;
    public String name;
    public String lastname;
    public String email;
    public String creation_date;
    public String about_me;

    public Portfolio() {
    }

    public Portfolio(Long id, String name, String lastname, String email, String creation_date, String about_me) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.creation_date = creation_date;
        this.about_me = about_me;
    }
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy="portfolio")
    private List<Job> jobs;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy="portfolio")
    private List<Skill> skills;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy="portfolio")
    private List<Project> projects;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy="portfolio")
    private List<Study> studies;    
}
