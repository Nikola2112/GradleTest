package com.example.gradle;

public class Person {
    private String name;
    private String LastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Person(String name, String lastName) {
        this.name = name;
        LastName = lastName;
    }
}
