/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobanco;

/**
 *
 * @author ESTUDIANTE
 */
public class Banco {
    public int numero;
    public int clave;
    public double saldo;
    public String Nombre;
    
    public Banco(int numeroC,int claveC,double saldoC,String NombreT){
        numero = numeroC;
        clave = claveC;
        saldo = saldoC;
        Nombre = NombreT;
    }
    
    public void consignar(float suma){
        this.saldo += suma; 
    }
    
    public void retirar(float resta){
        this.saldo -= resta;
    }
    
    public void cambiar(int clave){
        this.clave = clave;
    }
    
    public void consultar(){
        System.out.println("El saldo actual de " + this.Nombre + " es: $" + this.saldo);
    }
    
    public void info(){
        System.out.println("Nombre del titular: " + this.Nombre +
                           " Numero de cuenta: " + this.numero +
                           " Clave: " + this.clave +
                           " Saldo actual: " + this.saldo);
    }
}
