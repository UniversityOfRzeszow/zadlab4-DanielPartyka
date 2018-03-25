/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliczanieFigur;
import java.util.Scanner;
import static java.lang.Math.*;
/**
 *
 * @author Galan
 */
public class Kolo 
{
    float r;
    Kolo(float r)
    {
        this.r = r;
    }
    Scanner pobierz = new Scanner(System.in);
    public void pobierz()
    {
        System.out.println("Podaj zmienna");
        r = pobierz.nextFloat();
    }
    public void obwod()
    {
        System.out.println("Obwod kola wynosi "+(2*Math.PI*r));
    }
    public void pole()
    {
        System.out.println("Pole kola wynosi "+(2*pow(Math.PI,2)));
    }
}
