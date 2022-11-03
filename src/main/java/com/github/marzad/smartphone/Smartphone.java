package com.github.marzad.smartphone;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS{
    private String model;
    private String brand;
    private List<Friend> contacts = new ArrayList<>();

    public Smartphone() {
    }

    public Smartphone(String brand, String model, List<Friend> contacts) {
        this.brand = brand;
        this.model = model;
        this.contacts = contacts;
    }

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

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public List<Friend> getContacts() {
        return contacts;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setContacts(Friend contact) {
        this.contacts.add(contact);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
