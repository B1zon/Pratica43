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
public class Elipse implements FiguraComEixos,Serializable{
    
     private double r;
     private double s;
    
     public Elipse(){
         
     }
     public Elipse(double r, double s){
         this.r = r;
         this.s = s;
     }
     public double getEixoMenor(){
         return r;
     }
     public double getEixoMaior(){
         return s;
     }
     public void setR(double r){
         this.r = r;
     }
     public void setS(double s){
         this.s = s;
     }
     
     public double getArea(){
         double A;
         A = Math.PI*r*s;
         return A;
     }
     public double getPerimetro(){
         double P;
         P = Math.PI*(3*(r+s)-Math.sqrt((3*r+s)*(r+3*s)));
         return P;
     }
    public String getNome() {
        return this.getClass().getSimpleName();
    }
}
