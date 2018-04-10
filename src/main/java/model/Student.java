package model;

import java.util.*;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteLanguages = new ArrayList<>(Arrays.asList("Java","C#","Assembler"));

    public Student() {
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                ", favoriteLanguages=" + favoriteLanguages +
                '}';
    }

//    public List<String> getFavoriteLanguage() {
//        return favoriteLanguages;
//    }

//    public String getFavoriteLanguage() {
//        return favoriteLanguage;
//    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
}
