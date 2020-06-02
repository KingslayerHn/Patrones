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
public class Pickup implements Carro {
    String Color; 
    String Marca;
    
    public Pickup(String Color,String Marca){
        this.Color = Color; 
        this.Marca = Marca;
    }

    
    
    @Override
    public String getColor() {
        return this.Color;
    }
    @Override
    public String getMarca() {
        return this.Marca;
    }
}

