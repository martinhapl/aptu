/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hapl.aptu.ejb.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.hapl.aptu.ejb.entity.Employee;

/**
 *
 * @author Martin Hapl <martin.hapl@hapl.net>
 */
@Stateless
public class EmployeeFacade extends AbstractFacade<Employee> {

    @PersistenceContext(unitName = "APTU_EJB")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeeFacade() {
        super(Employee.class);
    }

    @Override
    protected void afterCreate(Employee entity) {
        // do nothing
    }

    @Override
    protected void afterEdit(Employee entity) {
        // do nothing
    }

    @Override
    protected void afterRempve(Employee entity) {
        // do nothing
    }
    
}
