/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;
import java.util.Scanner;
/**
 *
 * @author Galan
 */
public class Studenci 
{
        String imie;
        String nazwisko;
        int nr_indeks;
        String nazwa_specjalnosci;
        int rok_studiow;
    
    Studenci(String imie,String nazwisko,int nr_indeks,String nazwa_specjalnosci,int rok_studiow)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeks = nr_indeks;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.rok_studiow = rok_studiow;
    }
    Scanner pobierz = new Scanner(System.in);
    public void wczytaj()
    {
        imie = pobierz.nextLine();
        nazwisko = pobierz.nextLine();
        nr_indeks = pobierz.nextInt();
        nazwa_specjalnosci = pobierz.nextLine();
        rok_studiow = pobierz.nextInt();
        
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
