package com.company;

public class Documentar extends Film{
    int nr_ep;
    String descriere;

    public Documentar(String titlu, String regizor, double buget, int nr_ep, String descriere) {
        super(titlu, regizor, buget);
        this.nr_ep = nr_ep;
        this.descriere = descriere;
    }

    public int getNr_ep() {
        return nr_ep;
    }

    public void setNr_ep(int nr_ep) {
        this.nr_ep = nr_ep;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
    public void afisare(){
        System.out.println("Documentar cu titlul: " + titlu + "cu un numar de: " + "regizat de: " + regizor + " cu un buget de: " + buget + " cu un numar de: " + nr_ep + " episoade" + " si cu descrierea: " + descriere );
    }
}
