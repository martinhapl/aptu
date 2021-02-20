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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Martin Hapl <martin.hapl@hapl.net>
 */
@Entity
public class StudyGroupDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  
    @Column(name = "year_of_study", nullable = false)
    private int yearOfStudy;
    
    @Column(length = 2, name = "semester", nullable = false)
    @Enumerated(EnumType.STRING)
    private Enums.Semester semester;
    
    @Column(name = "number_of_students", nullable = false)
    private int numberOfStudents;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "study_group_id", referencedColumnName = "id", nullable = false) 
    private StudyGroup studyGroup;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudyGroupDetail)) {
            return false;
        }
        StudyGroupDetail other = (StudyGroupDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.hapl.aptu.ejb.entity.StudyGroupDetail[ id=" + id + " ]";
    }
    
    public Long getId() {
        return id;
    }

    /**
     * @return the yearOfStudy
     */
    public int getYearOfStudy() {
        return yearOfStudy;
    }

    /**
     * @param yearOfStudy the yearOfStudy to set
     */
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    /**
     * @return the semester
     */
    public Enums.Semester getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(Enums.Semester semester) {
        this.semester = semester;
    }

    /**
     * @return the numberOfStudents
     */
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    /**
     * @param numberOfStudents the numberOfStudents to set
     */
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    /**
     * @return the studyGroup
     */
    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

    /**
     * @param studyGroup the studyGroup to set
     */
    public void setStudyGroup(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }
    
    
}
