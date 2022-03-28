package com.company;

public class Eagle extends Animal{

  String name ;

    public Eagle(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.println("Eagle is flying");

    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                "} " ;
    }
}
