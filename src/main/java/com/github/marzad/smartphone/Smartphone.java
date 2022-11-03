package com.github.marzad.smartphone;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS{
    private String model; // Smartphonemodel
    private String brand; // Smartphonebrand
    private List<Contact> contacts = new ArrayList<>(); // Contactlist

    // Constructors
    public Smartphone() {
    }

    public Smartphone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public Smartphone(String brand, String model, List<Contact> contacts) {
        this.brand = brand;
        this.model = model;
        this.contacts = contacts;
    }

    // Overrides-Methods

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }
    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", contacts=" + contacts +
                '}';
    }

    // Getter and Setter
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public List<Contact> getContacts() {
        return contacts;
    }
    // Get a contact with a certain index
    public Contact getContact(int index){
        return this.contacts.get(index);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setContacts(List<Contact> contact) {
        this.contacts = contact;
    }

    // Add a contact to the list
    public void addContact(Contact contact){
        this.contacts.add(contact);
    }

    // Get a contact with a certain name
    public Contact getContactByName(String name){
       for(Contact i:this.contacts){
           if(i.getName()==name){
               return i;
           }
       }
       return null;
    }

    // Rremove a contact with a certain name
    public void removeContactByName(String name){
        for (int i = 0; i < this.contacts.size(); i++) {
            if(this.contacts.get(i).getName() == name){
                this.contacts.remove(i);
                break;
            }
        }
    }


}
