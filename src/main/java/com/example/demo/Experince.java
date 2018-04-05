package com.example.demo;

public class Experince {
    private String company;
    private String jobTitle;
    private String StartYear;
    private String endYear;
    private  String description;


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartYear() {
        return StartYear;
    }

    public void setStartYear(String startYear) {
        StartYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Experince{" +
                "company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", StartYear='" + StartYear + '\'' +
                ", endYear='" + endYear + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
