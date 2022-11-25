/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesPropias;

/**
 *
 * @author bislo
 */
public class SaldoLimiteException extends Exception{
 
    public SaldoLimiteException() {
        super("Saldo maximo sobrepasado");
    }
    
}

