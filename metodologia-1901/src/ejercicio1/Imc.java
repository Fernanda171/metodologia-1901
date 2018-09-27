/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author T-107
 */
public class Imc {
   Persona p;
   float valor;
   void calcular(){
       valor=p.peso/(p.altura*p.altura);
   }
}
