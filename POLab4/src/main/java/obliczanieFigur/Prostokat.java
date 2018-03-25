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
public class Prostokat 
{
    float a,b;
    Prostokat(float a,float b)
    {
        this.a = a;
        this.b = b;
    }
    Scanner pobierz = new Scanner(System.in);
    public void pobierz()
    {
        System.out.println("Podaj zmienna");
        a = pobierz.nextFloat();
        System.out.println("Podaj zmienna");
        b = pobierz.nextFloat();
    }
    public void obwod()
    {
        System.out.println("Obwod prostokata wynosi "+(2*a+2*b));
    }
    public void pole()
    {
        System.out.println("Pole kola wynosi "+(a*b));
    }
}
