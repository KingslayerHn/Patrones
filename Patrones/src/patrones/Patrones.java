/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 *
 * @author Lesterarte
 */
public class Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            SingletonPaises.getInstancia();
        }
    }
    
}