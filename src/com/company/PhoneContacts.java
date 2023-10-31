package com.company;

import java.util.*;

public class PhoneContacts {
    Map<String, Set<Contact>> phoneContactMap = new HashMap<>();

    public PhoneContacts() {
        this.phoneContactMap = new HashMap<>();
    }

    public void addGroup(String group) {  // группу добавляем в мапу
        if (!phoneContactMap.containsKey(group)) { // проверяем если нет такой группы то добавляем
            Set<Contact> contactSet = new HashSet<>();
            phoneContactMap.put(group, contactSet);
        } else {
            System.out.println("Данная группа уже существует");
        }
    }

    public void addContact(String group, Contact contact) {
        if (!phoneContactMap.containsKey(group)) {
            System.out.println("Такой группы не существует");
        } else {
            Set<Contact> contactSet = phoneContactMap.get(group);
            if (contactSet.contains(contact)) {
                System.out.println("Данный контак уже находится в этой группе");
            }else {
                phoneContactMap.get(group).add(contact);
            }

        }
    }

    @Override
    public String toString() {
        return "phoneContact=" + phoneContactMap;
    }
}
