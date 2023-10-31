package com.company;

public class Main {

    public static void main(String[] args) {

        Contact tima = new Contact("tima", "123");
        Contact alla = new Contact("alla", "456");

        PhoneContacts phoneContacts = new PhoneContacts();

        phoneContacts.addGroup("work");
        phoneContacts.addGroup("work");
        phoneContacts.addGroup("family");
        phoneContacts.addContact("work",tima);
        phoneContacts.addContact("work",tima);
        phoneContacts.addContact("family",alla);
        phoneContacts.addContact("family",tima);

        System.out.println(phoneContacts);
    }
}
