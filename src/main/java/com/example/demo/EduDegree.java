package com.example.demo;

public class EduDegree {
    private String education;
    private String degree;
    private  String university;
    private String year;

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return (degree+ "  in " +
                education  +", \n"+
                 university + ",  " +
                 year + "\n");
    }
}
