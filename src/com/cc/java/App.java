package com.cc.java;
public class App {
    public static void main(String[] args) {
      
    Worker worker = new Worker();
    Queen queen = new Queen();
    Drone drone = new Drone();

    ausgabe(worker.doYourJob());
    ausgabe(queen.doYourJob());
    ausgabe(drone.doYourJob());

    ausgabe("------------------");

    ausgabe(worker.fly());
    ausgabe(queen.fly());
    ausgabe(drone.fly());

  
    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
