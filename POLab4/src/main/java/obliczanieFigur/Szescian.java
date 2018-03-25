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
public class Szescian 
{
    float a;
    Szescian(float a)
    {
        this.a = a;
    }
    Scanner pobierz = new Scanner(System.in);
    public void pobierz()
    {
        System.out.println("Podaj zmienna");
        a = pobierz.nextFloat();
    }
    public void pole()
    {
        System.out.println("Pole szescianu wynosi "+(6*Math.pow(a,2)));
    }
    public void objetosc()
    {
        System.out.println("Objetosc szescianu wynosi "+(Math.pow(a,3)));
    }
}
