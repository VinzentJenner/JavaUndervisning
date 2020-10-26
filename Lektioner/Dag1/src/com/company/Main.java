package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 5; //Låda med namn x, som vi lägger siffran 5 i.
        System.out.println(x == 5); //"En femma ligger i låda x" --> true
        System.out.println(x == 4); //"En fyra ligger i låda x" --> false
        /*
            If(Villkor){
            Kommer hit om Villkor uppfylls
            }
            Annars fortsätter här

            = -> Tilldela variabel
            == -> Jämför variabler
         */

        if(x == 5){
            System.out.println("Hejsan");
        }

    }
}
