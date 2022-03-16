package com.company;

public class Film {
    String titlu;
    String regizor;
    double buget;

    public Film(String titlu, String regizor, double buget) {
        this.titlu = titlu;
        this.regizor = regizor;
        this.buget = buget;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getRegizor() {
        return regizor;
    }

    public void setRegizor(String regizor) {
        this.regizor = regizor;
    }

    public double getBuget() {
        return buget;
    }

    public void setBuget(double buget) {
        this.buget = buget;
    }
    public void afisare(){
        System.out.println("Titlul filmului:" + titlu + " regizat de:  " +  regizor  + " cu un buget de: " + buget);
    }
}
