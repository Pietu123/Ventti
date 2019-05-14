/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oliot;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author s1900013
 */
public class Venttipeli {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        //korttipakan luonti
        ArrayList<Integer> kortit = new ArrayList<>();

        kortit.add(2);
        kortit.add(3);
        kortit.add(4);
        kortit.add(5);
        kortit.add(6);
        kortit.add(7);
        kortit.add(8);
        kortit.add(9);
        kortit.add(10);
        kortit.add(11);
        kortit.add(12);
        kortit.add(13);
        kortit.add(14);
        
        
        Random r = new Random();

        //muuttujat
        int pelaajansumma = 0;
        int emannansumma = 0;

        //Pelaajan peli
        while (true) {
            int kortti = kortit.get(r.nextInt(kortit.size()));
            pelaajansumma = pelaajansumma + kortti;
            System.out.println(kortti);
            System.out.println("yht." + pelaajansumma);
           
            if (pelaajansumma == 21) {
                System.out.println("Ventti!");
                System.out.println("Voitit pelin!");
                break;

            } else if (pelaajansumma > 21) {
                System.out.println("Menit yli!");
                System.out.println("Hävisit!");
                break;

            } else if (pelaajansumma < 21) {
                System.out.println("Jos jäät tähän paina e");
                System.out.println("Jos haluat lisäkortin, paina enter");
                String syöte = lukija.nextLine();
                
            //Emännän peli alkaa jos painaa e    
                if (syöte.equals("e")) {
                    System.out.println("Jäät tähän:" + pelaajansumma);
                    while (true) {
                        int ekortti = kortit.get(r.nextInt(kortit.size()));
                        emannansumma = emannansumma + ekortti;

                        System.out.println(ekortti);
                        System.out.println("Emännan kortti " + emannansumma);
                        
                        if (emannansumma > 21) {
                            System.out.println("Voitit pelin!Emäntä meni yli.");
                            break;

                        } else if (emannansumma >= pelaajansumma) {
                            System.out.println("Emäntä voitti!");
                            break;

                        }

                    }
                    break;
                }
            }
        }

    }
}
