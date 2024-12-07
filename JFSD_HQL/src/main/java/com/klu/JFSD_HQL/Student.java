package com.klu.JFSD_HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private int dep_id;
    private String name;
    private double hod_sal;

    public int getDep_id() {
        return dep_id;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHod_sal() {
        return hod_sal;
    }

    public void setHod_sal(double hod_sal) {
        this.hod_sal = hod_sal;
    }
}