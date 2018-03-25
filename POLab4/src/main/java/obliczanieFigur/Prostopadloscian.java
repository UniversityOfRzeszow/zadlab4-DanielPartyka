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
public class Prostopadloscian 
{
    float a,b,c;
    Prostopadloscian(float a,float b,float c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Scanner pobierz = new Scanner(System.in);
    public void pobierz()
    {
        System.out.println("Podaj zmienna");
        a = pobierz.nextFloat();
        System.out.println("Podaj zmienna");
        b = pobierz.nextFloat();
        System.out.println("Podaj zmienna");
        c = pobierz.nextFloat();
    }
    public void pole()
    {
        System.out.println("Pole prostopadloscianu wynosi "+(2*(a*b+a*c+b*c)));
    }
    public void objetosc()
    {
        System.out.println("Objetosc prostopadloscianu wynosi "+(a*b*c));
    }
}
