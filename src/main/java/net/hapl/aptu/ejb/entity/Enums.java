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
    
    public enum FormOfStudy {
        P {
            @Override
            public String toString() {
                return "Presenční";
            }
        },
        K {
            @Override
            public String toString() {
                return "Kombinovaná";
            }
        };
    }
    
    public enum StudyProgram {
        bc {
            @Override
            public String toString() {
                return "Bc.";
            }
        },
        mgr {
            @Override
            public String toString() {
                return "Mgr.";
            }
        };
    }    
    
     public enum Semester {
        LS {
            @Override
            public String toString() {
                return "Letní";
            }
        },
        ZS {
            @Override
            public String toString() {
                return "Zimní";
            }
        };
    }    
    
}
