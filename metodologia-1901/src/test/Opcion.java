/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author T-107
 */
public class Opcion {
    String titulo;
    boolean correcta;
    public Opcion(String x, boolean y){
        System.out.println("Se invocara el constructor");
        titulo=x;
        correcta=y;
    }
}
