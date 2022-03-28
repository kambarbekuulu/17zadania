package com.company;

public class Turtle extends Animal{
    String name ;

    public Turtle(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println("Turtle is swimming");
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + name + '\'' +
                "} " ;
    }
}

