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
    
    private int hoursOfLectures;
    
    private int hoursOfSeminars;
    
    private int hoursOfExercises;
    
    private int numberOfWeeks;
    
    private String language;
    
    private String termination; // z, kz, zk
    
    private int credits;
    
    private int groupSize;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subject)) {
            return false;
        }
        Subject other = (Subject) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.hapl.test.app1.ejb.entity.Subject[ id=" + id + " ]";
    }
    
}
