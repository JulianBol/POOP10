/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

import excepcionesPropias.SaldoInsuficienteException;

/**
 *
 * @author poo01alu21
 */
class Cuenta {
    private double saldo;
    
    /**
     * CONSTRUCTOR VACIO
     */
    public Cuenta() {
    }
    
    /**
     * MÉTODO QUE REALIZA UN RETIRO, SI EL SALDO ES MENOR AL MONTO A RETIRAR ARROJA UNA EXCEPCION
     * @param monto
     * @throws SaldoInsuficienteException 
     */
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Reirando ....$"+monto);
        if(saldo < monto)
            throw new SaldoInsuficienteException();
        else
            this.saldo -= monto; 
    }
    
    /**
     * MÉTODO QUE REALIZA UN DEPOSITO, LA CANTIDAD ES EL PARAMETRO 'monto'
     * @param monto 
     */
    public void depositar(double monto){
        System.out.println("Depositando ....$"+monto);
        this.saldo += monto; 
    }
    
    /**
     * MÉTODO QUE RETORNA EL VALOR DE SALDO
     * @return 
     */
    public double getSaldo(){
        return saldo; 
    }

    /**
     * MÉTODO QUE RETORNA UN STRING CON LOS ATRIBUTOS DE LA CLASE
     * @return 
     */
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
}
