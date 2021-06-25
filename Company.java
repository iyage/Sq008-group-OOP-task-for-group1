package com.company;

import java.util.ArrayList;
// Creating company which composes of Ceo/Applicant classes and Staff class as an Array
public class Company {
    private  Ceo ceo;
    private ArrayList<Applicant> applicant;
    private String address;
    private String name;
    private ArrayList<Staff> staff;

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }
    public Ceo getCeo() {
        return ceo;
    }

    public void setCeo(Ceo ceo) {
        this.ceo = ceo;
    }

    public ArrayList<Applicant> getApplicant() {
        return applicant;
    }

    public void setApplicant(ArrayList<Applicant> applicant) {
        this.applicant = applicant;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Company(Ceo ceo, ArrayList<Staff>staff, ArrayList<Applicant> applicant, String address, String name) {
        this.ceo = ceo;
        this.staff = staff;
        this.applicant = applicant;
        this.address = address;
        this.name = name;
    }




}
