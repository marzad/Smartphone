package com.github.marzad.smartphone;

public class Friend extends Contact{
    private int number;

    public Friend() {
    }

    public Friend(String name, int number) {
        super.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.name + " : " + super.getName();
    }
}
