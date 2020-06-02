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
public class ClubRealMadrid extends Observador{
    
    private final double valorOfrecer = 250000;
    
    public ClubRealMadrid(futbolista futbolista){
        this.futbolista = futbolista;
        this.futbolista.agregar(this);    
    }
    
    @Override
    public void actualizar() {
        System.out.println("valor actual del jugador: " + futbolista.getEstado() +
                "\nReal madrid ofrece: "+ valorOfrecer +"\n");
        
    }
    
}
