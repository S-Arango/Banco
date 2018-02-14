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
    public float saldo;
    public String Nombre;
    
    public void consignar(float suma){
        this.saldo += suma; 
    }
    
    public void retirar(float resta){
        this.saldo -= resta;
    }
}
