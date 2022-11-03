package com.github.marzad.smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone mysmartphone = new Smartphone();
        mysmartphone.setBrand("Samsung");
        mysmartphone.setModel("Galaxy S22");

        mysmartphone.addContact(new Friend("Max","01736453426"));
        mysmartphone.addContact(new Friend("Anna","01736453426"));
        mysmartphone.addContact(new Friend("Lea","01736453426"));
        mysmartphone.addContact(new Friend("Anton","01736453426"));
        mysmartphone.addContact(new BuisnessContact("Autohaus","01736453426"));
        mysmartphone.addContact(new BuisnessContact("Arzt","01736453426"));
        mysmartphone.addContact(new Friend("Marie","01736453426"));
        mysmartphone.addContact(new Friend("Thomas","01736453426"));

        System.out.println("Position: "+ mysmartphone.getPosition());
        mysmartphone.startRadio();
        mysmartphone.stopRadio();

        System.out.println(mysmartphone.toString());

        System.out.println(mysmartphone.getContact(3));

        System.out.println(mysmartphone.getContactByName("Marie"));

        mysmartphone.removeContactByName("Anton");

        System.out.println(mysmartphone.getContacts());

    }



}