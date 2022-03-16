package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Film> film = new ArrayList<>();
        film.add(new Film("Death on the Nill","Kenneth Branagh", 2000000));
        film.add(new Film("Batman", "Matt Reeves", 3500000));
        film.add(new Documentar("Human Planet","Nicholas Brown",250000,5,"un film documentar eveniment despre uimitoarea relatie dintre oameni si natura. " ));
        film.add(new Documentar("Maradona","Emir Kustutica",1580000,2,"Documentar despre starul argentinian Diego Armando Maradona, privit de mulţi ca fiind cel mai mare fotbalist al lumii moderne." ));
        film.add(new Documentar("Mikel Jackson's This is It","Keny Ortega",25800000,1,"se bazează pe materialul filmat în timpul repetiţiilor la cele 50 de concerte pe care Michael Jackson ar fi trebuit să le susţină la Londra." ));
        film.add(new Muzical("The Lion King","Taymor",8258256, 7,"Esteban Oliver and Mukelisiwe Goba ","canta"));
        film.add(new Muzical("West Side Story","Steven Spilberg",4565823, 4,"Ansel Elgort, Rachel Zengler, Adiana DeBose, David Alvarez, Mike Faist","canta si danseaza"));

        prezentare(film);
        System.out.println("Filmele Musical cu un numar mai mare de 5 actori sunt: ");
        lista(film);

    }
    public static void prezentare(ArrayList<Film>film){
        for (var filme : film){
            filme.afisare();
        }
    }
    public static void lista (ArrayList<Film>film){
        int n = 5;
        int a = 0;
        for(var i :film) {
            if (i.getClass() == Muzical.class) {
                if (((Muzical) i).actori < n) ;

            }
            i.afisare();
        }
    }

}
