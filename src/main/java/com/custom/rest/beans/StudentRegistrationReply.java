package com.custom.rest.beans;

import java.util.Objects;

public class StudentRegistrationReply {

    String name;
    int age;
    String resgistrationNumber;
    String registrationStatus; 

    public StudentRegistrationReply() {
    }

    public StudentRegistrationReply(String name, int age, String resgistrationNumber, String registrationStatus) {
        this.name = name;
        this.age = age;
        this.resgistrationNumber = resgistrationNumber;
        this.registrationStatus = registrationStatus;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getResgistrationNumber() {
        return this.resgistrationNumber;
    }

    public void setResgistrationNumber(String resgistrationNumber) {
        this.resgistrationNumber = resgistrationNumber;
    }

    public String getRegistrationStatus() {
        return this.registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public StudentRegistrationReply name(String name) {
        this.name = name;
        return this;
    }

    public StudentRegistrationReply age(int age) {
        this.age = age;
        return this;
    }

    public StudentRegistrationReply resgistrationNumber(String resgistrationNumber) {
        this.resgistrationNumber = resgistrationNumber;
        return this;
    }

    public StudentRegistrationReply registrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof StudentRegistrationReply)) {
            return false;
        }
        StudentRegistrationReply studentRegistrationReply = (StudentRegistrationReply) o;
        return Objects.equals(name, studentRegistrationReply.name) && age == studentRegistrationReply.age && Objects.equals(resgistrationNumber, studentRegistrationReply.resgistrationNumber) && Objects.equals(registrationStatus, studentRegistrationReply.registrationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, resgistrationNumber, registrationStatus);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", resgistrationNumber='" + getResgistrationNumber() + "'" +
            ", registrationStatus='" + getRegistrationStatus() + "'" +
            "}";
    }

}