package com.github.marzad.smartphone;

public class Friend extends Contact{
    private String number;

    public Friend() {
    }

    public Friend(String name, String number) {
        super.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return super.getName()+ " : " + this.number;
    }
}
