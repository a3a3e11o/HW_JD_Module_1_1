package org.example;

public class Person {
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "{\"name\": \"" + name + "\", \"lastName\": \"" + lastName + "\"}";
    }
}