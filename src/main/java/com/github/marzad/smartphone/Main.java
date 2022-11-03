package com.github.marzad.smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone mysmartphone = new Smartphone();
        mysmartphone.setBrand("Samsung");
        mysmartphone.setModel("Galaxy S22");
        mysmartphone.setContacts(new Friend("Max","0179287739384"));
        mysmartphone.setContacts(new Friend("Maria","0159287739384"));
        mysmartphone.setContacts(new Friend("Anton","0189287339384"));
        mysmartphone.setContacts(new Friend("Anna","0179287737384"));

        System.out.println(mysmartphone.toString());
    }



}