package com.company;

public class Planet {
    private int orbit;
    private String name;
    public Planet(String n, int o){
        orbit = o;
        name = n;
    }

    public static void main(String[] args) {
        Planet p1 = new Planet("Venus", 2);
        System.out.println("When the moon is in the seventh house.");
    }
}
