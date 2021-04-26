package com.israa.gson1.mode;

public class CVInfo {

    private String Name;
    private  String Email ;
    private  String Hobbies;
    private String DateOfBirth;
    private String Gender ;
    private String Education;
    private String WorkExperience;

    public CVInfo(){}
    public CVInfo(String Name , String Email ,String Hobbies , String DateOfBirth , String Gender ,String Education , String WorkExperience){
        this.Name = Name ;
        this.Email = Email;
        this.Hobbies = Hobbies;
        this.DateOfBirth = DateOfBirth;
        this.Gender = Gender;
        this.Education = Education;
        this.WorkExperience = WorkExperience ;
    }
    public CVInfo(String Name , String Email ,String Hobbies , String DateOfBirth , String Gender){
        this.Name = Name ;
        this.Email = Email;
        this.Hobbies = Hobbies;
        this.DateOfBirth = DateOfBirth;
        this.Gender = Gender;
    }
    public CVInfo(String Education , String WorkExperience){
        this.Education = Education;
        this.WorkExperience = WorkExperience ;
    }

    public  String getName() {
        return Name;
    }

    public  void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public  void setEmail(String email) {
        Email = email;
    }

    public String getHobbies() {
        return Hobbies;
    }

    public  void setSkills(String skills) {
        Hobbies = skills;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getWorkExperience() {
        return WorkExperience;
    }

    public void setWorkExperience(String workExperience) {
        WorkExperience = workExperience;
    }
}
