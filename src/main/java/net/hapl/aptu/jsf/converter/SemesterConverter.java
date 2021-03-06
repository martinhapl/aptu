/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hapl.aptu.jsf.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import net.hapl.aptu.ejb.entity.Enums;

/**
 *
 * @author Martin Hapl <martin.hapl@hapl.net>
 */

@FacesConverter("net.hapl.aptu.jsf.converter.SemesterConverter")
public class SemesterConverter implements Converter {
   
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String s) {
        return Enums.Semester.valueOf(s); 
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        if (t == null) {
            return "";
        }
        return t.toString();
    }
}
