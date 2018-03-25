/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wprowadzDane;
import java.util.Scanner;
/**
 *
 * @author Galan
 */
public class Main 
{
    Student[] studenci = new Student[100];
    Scanner pobierz = new Scanner(System.in);
    int i;
    public void uzup()
    {
        for (i=0;i<100;i++)
        {
            studenci[i] = new Student("","",0,"",0);
        }
    }
    public void wstaw()
    {
        System.out.println("Podaj indeks tablicy, pod ktora chcialbys cos wstawic");
        i = pobierz.nextInt();
        studenci[i].imie = pobierz.nextLine();
        studenci[i].nazwisko = pobierz.nextLine();
        studenci[i].nr_indeks = pobierz.nextInt();
        studenci[i].nazwa_specjalnosci = pobierz.nextLine();
        studenci[i].rok_studiow = pobierz.nextInt();
    }
    public void edit()
    {
        System.out.println("Podaj indeks tablicy, pod ktory chcialbys edytowac");
        i = pobierz.nextInt();
        studenci[i].imie = pobierz.nextLine();
        studenci[i].nazwisko = pobierz.nextLine();
        studenci[i].nr_indeks = pobierz.nextInt();
        studenci[i].nazwa_specjalnosci = pobierz.nextLine();
        studenci[i].rok_studiow = pobierz.nextInt();
    }
    public void delete()
    {
        System.out.println("Podaj indeks tablicy, pod ktory chcialbys usunac cos");
        i = pobierz.nextInt();
        studenci[i].imie = "";
        studenci[i].nazwisko = "";
        studenci[i].nr_indeks = 0;
        studenci[i].nazwa_specjalnosci = "";
        studenci[i].rok_studiow = 0;
    }
    public void display()
    {
        System.out.println("Podaj indeks tablicy, pod ktory chcialbys zobaczyc");
        i = pobierz.nextInt();
        System.out.println(studenci[i].imie);
        System.out.println(studenci[i].nazwisko);
        System.out.println(studenci[i].nr_indeks);
        System.out.println(studenci[i].nazwa_specjalnosci);
        System.out.println(studenci[i].rok_studiow);
    }
    public void displayall()
    {
        for (i=0;i<100;i++)
        {
        System.out.println(studenci[i].imie);
        System.out.println(studenci[i].nazwisko);
        System.out.println(studenci[i].nr_indeks);
        System.out.println(studenci[i].nazwa_specjalnosci);
        System.out.println(studenci[i].rok_studiow);
        }
    }
    public void displayrange()
    {
        int n,m;
        System.out.println("Podaj zakres jaki chcialbys zobaczyc");
        m = pobierz.nextInt();
        n = pobierz.nextInt();
        for (i=m;i<n;i++)
        {
        System.out.println(studenci[i].imie);
        System.out.println(studenci[i].nazwisko);
        System.out.println(studenci[i].nr_indeks);
        System.out.println(studenci[i].nazwa_specjalnosci);
        System.out.println(studenci[i].rok_studiow);
        }
    }
        
     
        
        
}
    

