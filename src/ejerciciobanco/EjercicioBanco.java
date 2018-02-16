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
public class EjercicioBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco cuenta1 = new Banco(1012, 1234, 0.0,"Magdalena Sanchez");
        Banco cuenta2 = new Banco(1013, 9876, 500000,"Joselito Perez");
        //Banco cuenta2 = new Banco();
        
        cuenta1.consultar();
        cuenta1.consignar(100000);
        cuenta1.consultar();
        cuenta2.info();
        cuenta2.cambiar(5674);
        cuenta2.info();
    }
    
}
