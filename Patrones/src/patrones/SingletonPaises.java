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
public class SingletonPaises {
    
    private static SingletonPaises instancia; 
    
    private SingletonPaises() {}
    
    public static SingletonPaises getInstancia() {
        if(instancia == null){
            instancia = new SingletonPaises();
            System.out.println("Lista de paises creada");
        }else{
            System.out.println("Ya existe una lista de paises");
        }
        return instancia;
    }
    
    
}
