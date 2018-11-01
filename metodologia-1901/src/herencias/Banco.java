/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author T-107
 */
public class Banco {
    public static void main(String[] args) {
        //Primero creamos una tarjeta credito
        TarjetaCredito tcredito=new TarjetaCredito();
        tcredito.setNumero(1234);
        tcredito.setNombre ("banamex");
        tcredito.setTipo ("credito");
        
        TarjetaAhorro tarjetaAhorro=new TarjetaAhorro();
        tarjetaAhorro.setNumero(4321);
        tarjetaAhorro.setNombre ("bancomer");
        tarjetaAhorro.setTipo("ahorro");
        
        TarjetaNomina tnomina=new TarjetaNomina();
        tnomina.setNumero(777);
        tnomina.setNombre ("hsbc");
        tnomina.setTipo ("nomina");
    }   
} 

