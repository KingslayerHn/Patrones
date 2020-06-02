/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lesterarte
 */
public class futbolista {
    private List<Observador> observadores = new ArrayList<Observador>();
    private int estado; 
    
    public int getEstado() {
        return this.estado;
    }
    public void setEstado(int estado){
        this.estado = estado; 
        notificar();        
    }
    public void agregar(Observador observador){
        observadores.add(observador);
        
    }
    public void notificar() {
        for(Observador observador: observadores){
            observador.actualizar();
        }
    }
}
