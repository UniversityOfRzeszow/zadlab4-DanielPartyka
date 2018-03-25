/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliczanieFigur;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Galan
 */
public class Kwadrat 
{
float a;
    Kwadrat(float a)
    {
        this.a = a;
    }
    Scanner pobierz = new Scanner(System.in);
    public void pobierz()
    {
        System.out.println("Podaj zmienna");
        a = pobierz.nextFloat();
    }
    public void obwod()
    {
        System.out.println("Obwod kwadratu wynosi "+(4*a));
    }
    public void pole()
    {
        System.out.println("Pole kwadratu wynosi "+(a*a));
    }    
    
}
