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
class FactoryGlobal implements factory {
    public final static String PICKUP = "Pickup"; 
    public final static String CONVERTIBLE = "Convertible";
    
    @Override
    public Carro crearCarro(String tipo, String color, String marca){
        switch(tipo){
            case PICKUP: 
                return new Pickup(color,marca);
               
            case CONVERTIBLE:
               return new Convertible(color,marca);
              
            default: 
                return null;
                
        }        
    } 
}
