package com.cc.java;
public class App {

    // static Honeybee worker;

    public static void main(String[] args) {
      
    HoneyBee worker = new Worker();
    HoneyBee queen = new Queen();
    HoneyBee drone = new Drone();

    ausgabe(worker.doYourJob());
    ausgabe(queen.doYourJob());
    ausgabe(drone.doYourJob());

    ausgabe("------------------");

    ausgabe(worker.fly());
    ausgabe(queen.fly());
    ausgabe(drone.fly());

    ausgabe("------aber: ---------");

    // Das sollte eigentlich nicht gehen!
    HoneyBee bee = new HoneyBee();
    ausgabe(bee.doYourJob());
  
    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
