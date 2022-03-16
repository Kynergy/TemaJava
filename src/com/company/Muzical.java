package com.company;

public class Muzical extends Film{
    Integer actori;
    String nume;
    String skills;

    public Integer getActori() {
        return actori;
    }

    public void setActori(Integer actori) {
        this.actori = actori;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Muzical(String titlu, String regizor, double buget, Integer actori, String nume, String skills) {
        super(titlu, regizor, buget);
        this.actori = actori;
        this.nume = nume;
        this.skills = skills;
    }
    public void afisare(){
        System.out.println("Titlul muzicalului:" + titlu + " regizat de: " + regizor + " cu un buget de: " + buget + " cu un numar de : " + actori +" actori " + skills);

    }
}
