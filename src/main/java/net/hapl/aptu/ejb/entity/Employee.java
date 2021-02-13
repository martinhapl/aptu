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
public class Employee implements Serializable {

    private static long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 255, name = "name", nullable = false)
    private String name;
    
    @Column(length = 255, name = "surname", nullable = false)
    private String surname;
    
    @Column(length = 255, name = "phone", nullable = false)
    private String phone;
    
    @Column(length = 255, name = "mobile", nullable = false)
    private String mobile;
    
    @Column(length = 255, name = "email", nullable = false)
    private String email;
    
    @Column(name = "doctoral_student", nullable = false)
    private boolean doctoralStudent;
    
    @Column(name = "working_time", nullable = false)
    private double workingTime;

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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.hapl.aptu.ejb.entity.Emplotee[ id=" + getId() + " ]";
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
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the workingTime
     */
    public double getWorkingTime() {
        return workingTime;
    }

    /**
     * @param workingTime the workingTime to set
     */
    public void setWorkingTime(double workingTime) {
        this.workingTime = workingTime;
    }

    /**
     * @return the doctoralStudent
     */
    public boolean isDoctoralStudent() {
        return doctoralStudent;
    }

    /**
     * @param doctoralStudent the doctoralStudent to set
     */
    public void setDoctoralStudent(boolean doctoralStudent) {
        this.doctoralStudent = doctoralStudent;
    }
    
    
    
}
