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
public class Kula 
{
    float r;
    Kula(float r)
    {
        this.r = r;
    }
    Scanner pobierz = new Scanner(System.in);
    public void pobierz()
    {
        System.out.println("Podaj zmienna");
        r = pobierz.nextFloat();
    }
    public void Pole()
    {
        System.out.println("Pole kuli wynosi "+(4*Math.PI*Math.pow(r,2)));
    }
    public void Objetosc()
    {
        System.out.println("Objetosc kuli wynosi "+(4*Math.PI*Math.pow(r, 3))/3);
    }
}
