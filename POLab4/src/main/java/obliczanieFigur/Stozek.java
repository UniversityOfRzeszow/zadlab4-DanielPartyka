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
public class Stozek 
{
    float r,h,l;
    Stozek(float r,float h,float l)
    {
        System.out.println("Podaj zmienna");
        this.r = r;
        System.out.println("Podaj zmienna");
        this.h = h;
        System.out.println("Podaj zmienna");
        this.l = l;
    }
    Scanner pobierz = new Scanner(System.in);
    public void pobierz()
    {
        r = pobierz.nextFloat();
        h = pobierz.nextFloat();
        l = pobierz.nextFloat();
    }
    public void pole()
    {
        System.out.println("Pole stozka wynosi "+(Math.PI*r*(r+l)));
    }
    public void objetosc()
    {
        System.out.println("Pole kola wynosi "+(Math.PI*Math.pow(r,2)*h)/3);
    }
}
