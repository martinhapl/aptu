/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hapl.aptu.ejb.entity;

/**
 *
 * @author Martin Hapl <martin.hapl@hapl.net>
 */
public class Enums {
    
    public enum Lang {
        CS {
            @Override
            public String toString() {
                return "Čeština";
            }
        },
        EN {
            @Override
            public String toString() {
                return "Angličtina";
            }
        };
        
    }
    
    
}
