/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliczanieFigur;
import java.util.Scanner;
/**
 *
 * @author Galan
 */
public class Main {
        public static void main(String[] args) 
        {
            int wybor;
            System.out.println("Podaj wybor 1=Kolo,2=Kula,3=Kwadrat,4=Prostokat,5=Prostopadloscian,6=Stozek,7=Szescian");
            Scanner pobierz = new Scanner(System.in);
            wybor = pobierz.nextInt();
            switch(wybor)
            {
                case 1:
                    Kolo kolo = new Kolo(2);
                    kolo.pobierz();
                    kolo.obwod();
                    kolo.pole();
                    break;
                case 2:
                    Kula kula = new Kula(3);
                    kula.pobierz();
                    kula.Pole();
                    kula.Objetosc();
                    break;
                case 3:
                    Kwadrat kwadrat = new Kwadrat(2);
                    kwadrat.pobierz();
                    kwadrat.obwod();
                    kwadrat.pole();
                    break;
                case 4:
                    Prostokat prosto = new Prostokat(2,3);
                    prosto.pobierz();
                    prosto.obwod();
                    prosto.pole();
                    break;
                case 5:
                    Prostopadloscian prosto1 = new Prostopadloscian(2,3,4);
                    prosto1.pobierz();
                    prosto1.pole();
                    prosto1.objetosc();
                    break;
                case 6:
                    Stozek stozek = new Stozek(5,4,3);
                    stozek.pobierz();
                    stozek.pole();
                    stozek.objetosc();
                    break;
                case 7:
                    Szescian szescian = new Szescian(2);
                    szescian.pobierz();
                    szescian.pole();
                    szescian.objetosc();
                    break;
            }
        }
    
}
