/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */

import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

public class Pratica43 {
    public static void main(String[] args) {
        Elipse E1 = new Elipse(4.0,5.0);
        Quadrado Q1 = new Quadrado(5.0);
        Circulo C1 = new Circulo(4.0);
        Retangulo R1 = new Retangulo(3.0,6.0);
        TrianguloEquilatero E2 = new TrianguloEquilatero(7.0);
        
        System.out.println("Área "+E1.getNome()+"1: "+E1.getArea());
        System.out.println("Perimetro "+E1.getNome()+"1: "+E1.getPerimetro());
        System.out.println("Área Quadrado 1: "+Q1.getArea());
        System.out.println("Perimetro Quadrado 1: "+Q1.getPerimetro());
        System.out.println("Área "+C1.getNome()+"1: "+C1.getArea());
        System.out.println("Perimetro "+C1.getNome()+"1: "+C1.getPerimetro());
        System.out.println("Área Retangulo 1: "+R1.getArea());
        System.out.println("Perimetro Retangulo 1: "+R1.getPerimetro());
        System.out.println("Área TrianguloEquilatero 1: "+E2.getArea());
        System.out.println("Perimetro TrianguloEquilatero 1: "+E2.getPerimetro());
    }
}
