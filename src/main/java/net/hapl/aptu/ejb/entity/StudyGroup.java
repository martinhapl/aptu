/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hapl.aptu.ejb.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Martin Hapl <martin.hapl@hapl.net>
 */
@Entity
public class StudyGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 20, name = "shortcut", nullable = false)
    private String shortcut;
   
    @Column(length = 255, name = "name", nullable = false)
    private String name;
    
    @Column(length = 1, name = "form_of_study", nullable = false)
    @Enumerated(EnumType.STRING)
    private Enums.FormOfStudy formOfStudy;
    
    @Column(length = 2, name = "language", nullable = false)
    @Enumerated(EnumType.STRING)
    private Enums.Lang language;
        
    @Column(length = 3, name = "study_program", nullable = false)
    @Enumerated(EnumType.STRING)
    private Enums.StudyProgram studyProgram;
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudyGroup)) {
            return false;
        }
        StudyGroup other = (StudyGroup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.hapl.aptu.ejb.entity.StudyGroup[ id=" + id + " ]";
    }

    public Long getId() {
        return id;
    }
    
    /**
     * @return the shortcut
     */
    public String getShortcut() {
        return shortcut;
    }

    /**
     * @param shortcut the shortcut to set
     */
    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the formOfStudy
     */
    public Enums.FormOfStudy getFormOfStudy() {
        return formOfStudy;
    }

    /**
     * @param formOfStudy the formOfStudy to set
     */
    public void setFormOfStudy(Enums.FormOfStudy formOfStudy) {
        this.formOfStudy = formOfStudy;
    }

    /**
     * @return the language
     */
    public Enums.Lang getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(Enums.Lang language) {
        this.language = language;
    }

    /**
     * @return the studyProgram
     */
    public Enums.StudyProgram getStudyProgram() {
        return studyProgram;
    }

    /**
     * @param studyProgram the studyProgram to set
     */
    public void setStudyProgram(Enums.StudyProgram studyProgram) {
        this.studyProgram = studyProgram;
    }
    
}
