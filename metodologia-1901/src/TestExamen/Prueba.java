/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestExamen;

/**
 *
 * @author T-107
 */
public class Prueba {
    public static void main(String[] args) {
        Opcion op1=new Opcion("Popocatepelt",false);
        System.out.println("Tu titulo es "+op1.titulo);
        System.out.println("Es correcta "+op1.correcta);
        Opcion op2=new Opcion("Everest",true);
        Opcion op3=new Opcion("Aconcagua",false);
        Opcion op4=new Opcion("Pico de Orizaba",false);
       
        
        Opcion[] opciones={op1,op2,op3,op4};  
        
        Pregunta p1=new Pregunta("¿Cuál es la montaña más alta del mundo?", opciones);
        System.out.println(p1.titulo);
        for (Opcion opcion : opciones) {
            System.out.println(opcion.titulo);
        }
    }

    /**
     *
     * @param args
     */
  /**  public static void main(String[] args) {
        Opcion op1=new Opcion("Jalisco",false);
        //System.out.println("Tu titulo es "+op1.titulo);
        //System.out.println("Es correcta "+op1.correcta);
        Opcion op2=new Opcion("Michoacan",false);
        Opcion op3=new Opcion("Coahuila",true);
        Opcion op4=new Opcion("Tamaulipas",false);
       
        
        Opcion[] opciones={op1,op2,op3,op4};  
        
        Pregunta p1=new Pregunta("Todos los siguientes estados tienen costas excepto...", opciones);
        System.out.println(p1.titulo);
        for (Opcion opcion : opciones) {
            System.out.println(opcion.titulo);
            */
}
