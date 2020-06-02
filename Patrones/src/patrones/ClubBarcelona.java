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
public class ClubBarcelona extends Observador{
    
    private final double valorOfrecer = 100000;
    
    public ClubBarcelona(futbolista futbolista){
        this.futbolista = futbolista;
        this.futbolista.agregar(this);    
    }

    @Override
    public void actualizar() {
        System.out.println("valor actual del jugador: " + futbolista.getEstado() +
                "\nBacelona ofrece: "+ valorOfrecer +"\n");
    }
    
    
}
