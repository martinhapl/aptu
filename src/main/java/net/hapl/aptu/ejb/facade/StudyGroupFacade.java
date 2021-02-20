/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hapl.aptu.ejb.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.hapl.aptu.ejb.entity.Enums;
import net.hapl.aptu.ejb.entity.StudyGroup;
import net.hapl.aptu.ejb.entity.StudyGroupDetail;

/**
 *
 * @author Martin Hapl <martin.hapl@hapl.net>
 */
@Stateless
public class StudyGroupFacade extends AbstractFacade<StudyGroup> {

    @PersistenceContext(unitName = "APTU_EJB")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudyGroupFacade() {
        super(StudyGroup.class);
    }

    @Override
    protected void afterCreate(StudyGroup studyGroup) {
        // zalozi se detaily skupinky, podle "studijni program" se zalozi rocniky)
        System.out.println("studyGroup: " + studyGroup);
        int maxYear = 2; // pro Mgr
        if (Enums.StudyProgram.bc.equals(studyGroup.getStudyProgram())) {
            // Bc.
            maxYear = 3;
        }
        
        for (int year = 1; year <= maxYear; year++) {
            StudyGroupDetail sgdLs = new StudyGroupDetail();
            sgdLs.setYearOfStudy(year);
            sgdLs.setSemester(Enums.Semester.LS);
            sgdLs.setStudyGroup(studyGroup);
            em.merge(sgdLs);

            StudyGroupDetail sgdZs = new StudyGroupDetail();
            sgdZs.setYearOfStudy(year);
            sgdZs.setSemester(Enums.Semester.ZS);
            sgdZs.setStudyGroup(studyGroup);
            em.merge(sgdZs);            
        }
        
    }

    @Override
    protected void afterEdit(StudyGroup entity) {
        // do nothing
    }

    @Override
    protected void afterRempve(StudyGroup entity) {
        // do nothing
    }
    
}
