package com.company;

public class Applicant {
    public Applicant(int yearsOfExperience, String name, String qualification, int age,String department) {
        this.yearsOfExperience = yearsOfExperience;
        this.name = name;
        this.qualification = qualification;
        this.age = age;
        this.department= department;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int yearsOfExperience;
    private String name;
    private String qualification;
    private int age;
    private  String department;
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}

