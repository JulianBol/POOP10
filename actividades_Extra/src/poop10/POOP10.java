/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

import excepcionesPropias.NumeroMaximoDepositos;
import excepcionesPropias.SaldoInsuficienteException;
import excepcionesPropias.SaldoLimiteException;

/**
 *
 * @author poo01alu21
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SaldoLimiteException {
        // TODO code application logic here
        try{
            String mensajes[] = {"Mensaje 1","Mensaje 2", "Mensaje 3"};
            for (int i = 0; i <= mensajes.length; i++) {
                System.out.println(mensajes[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de los limites");
            //e.printStackTrace();
        }
        System.out.println("#####################");
        try{
            float x =10/0;
            System.out.println("X = "+x);
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }finally{
            System.out.println("Cualquier cosa que suceda entra al finally");
        }
        
        System.out.println("##########catch anidado###########");
        try{
            float x =10/0;
            System.out.println("X = "+x);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de los limites");
            
        }catch(ArithmeticException e){
            System.out.println("Error, no se puede dividir entre 0");
        }
        
        System.out.println("######### Propagacion de excepcion#####");
        try{
            float division = metodoDivision(4,0);
            System.out.println("Division ="+division);
        }catch(ArithmeticException e){
            System.out.println("Excepcion que sucede en el metodo");
        }
        System.out.println("@@@@@Excepciones marcadas@@@@@");
        try{
            float div = metodoDivisionMarcada(5,0);
        }catch(ArithmeticException e){
            System.out.println("Excepcion de division entre 0 marcada ");
        }
        
        System.out.println("######Creacion de excepciones######");
        Cuenta cuenta = new Cuenta();
        try {
            cuenta.depositar(18_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
            cuenta.retirar(10_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
            cuenta.retirar(10_000);
        } catch (SaldoInsuficienteException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("-------Actividades extras---------");
        try {
            cuenta.depositar(22_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
        } catch (SaldoLimiteException ex){
            System.out.println(ex.getMessage());
        }
        int contador = 0;
        try {
            contador = cuenta.depositar2(1_000,contador);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
            contador = cuenta.depositar2(1_000,contador);
            contador = cuenta.depositar2(1_000,contador);
            contador = cuenta.depositar2(1_000,contador);
        } catch (NumeroMaximoDepositos ex){
            System.out.println(ex.getMessage());
        }
    }   
        

    
    private static float metodoDivision(int a, int b){
        return a/b;
    }

    private static float metodoDivisionMarcada(int a, int b) throws ArithmeticException {
        return a/b;
    }
}
