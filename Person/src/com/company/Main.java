package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
    }
}
