package com.company;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        //Låda med namn x, som vi lägger siffran 5 i.
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


        String correct_password = "Apelsinjuice";
        Scanner sc = new Scanner(System.in); //Skapar 'Scanner' sc i minnet. Lägger ett nytt scanner-objekt där.

        System.out.println("Vad är lösenordet");
        String password = sc.nextLine();

        if(correct_password.equals(password)){ //Kontrollerar om lösenordet stämmer
            System.out.println("Hemligt meddelande");
        }
        else if(password.equals("Password")){ //Om lösenordet inte stämmer kollar den om man gissat på 'Password'
            System.out.println("Tror du att det skulle vara så enkelt?");
        }
        else{ //Om inget stämmer ovan hoppar vi in hit
            System.out.println("RINGER POLISEN!");
        }

        int added = 0;
        for(int i = 1; i<=10; i++){ //Gör något ett bestämt antal gånger; avbryter när villkoret inte stämmer
            added = added + i; //Adderar alla tal i loopen. Först blir det 0+1=1, sen 1+2=3, 3+3=6, 6+4=10...
            System.out.println(added);
        }
    }
}
