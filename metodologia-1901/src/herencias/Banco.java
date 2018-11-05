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
        tcredito.setSaldo(100);
        
        TarjetaAhorro tarjetaAhorro=new TarjetaAhorro();
        tarjetaAhorro.setNumero(4321);
        tarjetaAhorro.setNombre ("bancomer");
        tarjetaAhorro.setTipo("ahorro");
        tarjetaAhorro.setSaldo(100);
        
        TarjetaNomina tnomina=new TarjetaNomina();
        tnomina.setNumero(777);
        tnomina.setNombre ("hsbc");
        tnomina.setTipo ("nomina");
        tnomina.setSaldo(100);
    
        //Generamos el codigo del deposito
        //Vamos a hacerlo de la forma más básica
        
        
        //Tarjeta de Nómica
        //tnomina.pagar(150);
        //Tarjeta de Ahorro
        //tarjetaAhorro.pagar(150);
        //Tarjeta de Crédito
       // tcredito.pagar(150);
    
        //Generamos un arreglo de tarjetas
        Tarjeta tarjetas[]=new Tarjeta[3];
        tarjetas[0]=tnomina;
        tarjetas[1]=tcredito;
        tarjetas[2]=tarjetaAhorro;
        
        //Iteramos el arreglo
        for(Tarjeta t: tarjetas){
            t.pagar(150);
            System.out.println("Saldo es "+t.getSaldo()+" Tipo "+t.getTipo());
        }
    }   
} 

