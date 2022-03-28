package com.company;

public class Sark extends Animal{
    String name;

    public Sark(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sark{" +
                "name='" + name + '\'' +
                "} " ;
    }

    public void attack(){
        System.out.println("Sark is attacking");
    }
}
