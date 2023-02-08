package com.cognixia.jump.model;

public class Customer {

    private int userID;
    private String firstName;
    private String lastName;
    private String contactInfo;
    private String password;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer(String firstName, String lastName, String contactInfo, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer [userID= " + userID + ", firstName= " + firstName + ", lastName= " + lastName + ", contactInfo= "
                + contactInfo + ", password= " + password + "]";
    }

}
