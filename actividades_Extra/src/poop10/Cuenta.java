/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

import excepcionesPropias.NumeroMaximoDepositos;
import excepcionesPropias.SaldoInsuficienteException;
import excepcionesPropias.SaldoLimiteException;

/**
 *
 * @author poo01alu21
 */
class Cuenta {
    private double saldo;

    public Cuenta() {
    }
    
    /**
     * Metodo que retira un 'monto' al saldo de la cuenta o clase
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
     * Metodo que deposita un 'monto' al saldo de la cuenta o clase
     * @param monto
     * @throws SaldoLimiteException 
     */
    public void depositar(double monto)throws SaldoLimiteException{
        if(monto >= 20000)
            throw new SaldoLimiteException();
        else{
            System.out.println("Depositando ....$"+monto);
            this.saldo += monto; 
        }
    }
    
    /**
     * Metodo que deposita un 'monto' con numero maximo de operaciones 'depositos' al saldo de la cuenta o clase
     * @param monto
     * @param contador
     * @return
     * @throws NumeroMaximoDepositos 
     */
    public int depositar2(double monto,int contador)throws NumeroMaximoDepositos{
        if(contador >= 3)
            throw new NumeroMaximoDepositos();
        else{
            System.out.println("Depositando ....$"+monto);
            this.saldo += monto; 
            contador += 1;
        }
        return contador;
    }
    
    /**
     * Retorna el valor de saldo
     * @return 
     */
    public double getSaldo(){
        return saldo; 
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
}
