/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hapl.aptu.ejb.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Martin Hapl <martin.hapl@hapl.net>
 */
@Entity
public class Subject implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 20, name = "shortcut", nullable = false)
    private String shortcut;
   
    @Column(length = 255, name = "name", nullable = false)
    private String name;
    
    @Column(name = "hoursOfLectures", nullable = false)
    private int hoursOfLectures;
    
    @Column(name = "hoursOfSeminars", nullable = false)
    private int hoursOfSeminars;
    
    @Column(name = "hoursOfExercises", nullable = false)
    private int hoursOfExercises;
    
    @Column(name = "numberOfWeeks", nullable = false)
    private int numberOfWeeks;
    
    @Column(name = "language", nullable = false)
    private Enums.Lang language;
    
    @Column(name = "termination", nullable = false)
    private Enums.SubjectTermination termination; // z, kz, zk
    
    @Column(name = "credits", nullable = false)
    private int credits;
    
    @Column(name = "groupSize", nullable = false)
    private int groupSize;
    
    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subject)) {
            return false;
        }
        Subject other = (Subject) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.hapl.aptu.ejb.entity.Subject[ id=" + getId() + " ]";
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
     * @return the hoursOfLectures
     */
    public int getHoursOfLectures() {
        return hoursOfLectures;
    }

    /**
     * @param hoursOfLectures the hoursOfLectures to set
     */
    public void setHoursOfLectures(int hoursOfLectures) {
        this.hoursOfLectures = hoursOfLectures;
    }

    /**
     * @return the hoursOfSeminars
     */
    public int getHoursOfSeminars() {
        return hoursOfSeminars;
    }

    /**
     * @param hoursOfSeminars the hoursOfSeminars to set
     */
    public void setHoursOfSeminars(int hoursOfSeminars) {
        this.hoursOfSeminars = hoursOfSeminars;
    }

    /**
     * @return the hoursOfExercises
     */
    public int getHoursOfExercises() {
        return hoursOfExercises;
    }

    /**
     * @param hoursOfExercises the hoursOfExercises to set
     */
    public void setHoursOfExercises(int hoursOfExercises) {
        this.hoursOfExercises = hoursOfExercises;
    }

    /**
     * @return the numberOfWeeks
     */
    public int getNumberOfWeeks() {
        return numberOfWeeks;
    }

    /**
     * @param numberOfWeeks the numberOfWeeks to set
     */
    public void setNumberOfWeeks(int numberOfWeeks) {
        this.numberOfWeeks = numberOfWeeks;
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
     * @return the termination
     */
    public Enums.SubjectTermination getTermination() {
        return termination;
    }

    /**
     * @param termination the termination to set
     */
    public void setTermination(Enums.SubjectTermination termination) {
        this.termination = termination;
    }

    /**
     * @return the credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * @param credits the credits to set
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * @return the groupSize
     */
    public int getGroupSize() {
        return groupSize;
    }

    /**
     * @param groupSize the groupSize to set
     */
    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }
    
}
