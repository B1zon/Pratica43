/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.pratica;
import java.io.Serializable;
/**
 *
 * @author a1338773
 */
public class Retangulo implements FiguraComLados,Serializable{
       
      private double ladoMenor;
      private double ladoMaior;
      
      public Retangulo(){
          
      }
      public Retangulo(double ladoMenor, double ladoMaior){
             this.ladoMaior = ladoMaior;
             this.ladoMenor = ladoMenor;
      }
      @Override
      public double getLadoMenor(){
             return ladoMenor;
      }
      @Override
      public double getLadoMaior(){
             return ladoMaior;
      }
      public double getArea() {
        return getLadoMaior() * getLadoMenor();
      }

      public double getPerimetro() {
        return (getLadoMaior() + getLadoMenor()) * 2;
      }
}
