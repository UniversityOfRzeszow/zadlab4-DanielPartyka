/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author Galan
 */
public class Studenci1 
{
    String imie;
    String nazwisko;
    int nr_indeks;
    String nazwa_specjalnosci;
    int rok_studiow;
    
    Studenci1(String imie,String nazwisko,int nr_indeks,String nazwa_specjalnosci,int rok_studiow)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeks = nr_indeks;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.rok_studiow = rok_studiow;
    }
     Studenci1(String imie,String nazwisko,int nr_indeks,String nazwa_specjalnosci)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeks = nr_indeks;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        
    }
     Studenci1(String imie,String nazwisko,int nr_indeks)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeks = nr_indeks;
    }
      Studenci1(String imie,String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public void pokaz()
    {
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(nr_indeks);
        System.out.println(nazwa_specjalnosci);
        System.out.println(rok_studiow);
    }

}
