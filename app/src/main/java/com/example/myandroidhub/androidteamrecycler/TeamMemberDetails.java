package com.example.myandroidhub.androidteamrecycler;

public class TeamMemberDetails
{
    private int imageURL;
    private String empName;
    private String empAge;
    private String empHobby;

    public int getImageURL() {
        return imageURL;
    }

    public void setImageURL(int imageURL) {
        this.imageURL = imageURL;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAge() {
        return empAge;
    }

    public void setEmpAge(String empAge) {
        this.empAge = empAge;
    }

    public String getEmpHobby() {
        return empHobby;
    }

    public void setEmpHobby(String empHobby) {
        this.empHobby = empHobby;
    }

    public TeamMemberDetails(int imageURL, String empName, String empAge, String empHobby) {
        this.imageURL = imageURL;
        this.empName = empName;
        this.empAge = empAge;
        this.empHobby = empHobby;
    }
}
