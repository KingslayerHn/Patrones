/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.Scanner;

/**
 *
 * @author Lesterarte
 */
public class Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione un patron\n1. Singleton\n2. Factory\n3. Observer"
                + "4. Adapter\n5. Builder\n6. State ");
        int op = entrada.nextInt();
        
        switch (op) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    SingletonPaises.getInstancia();
                }   break;
            case 2:
                String tipo = "Convertible";
                String color = "Rojo";
                String marca="Honda";
                
                factory mifabrica = new FactoryGlobal();
                
                Carro miCarro = mifabrica.crearCarro(tipo,color,marca);
                System.out.println("Carro tipo: "+ tipo+ "\nColor: "+ miCarro.getColor()+
                        "\nMarca: "+ miCarro.getMarca());
                break;
            case 3:   
                int precioJugador = 112400;
                futbolista Mbappe = new futbolista();
                new ClubBarcelona(Mbappe);
                new ClubRealMadrid(Mbappe);
                
                System.out.println("actualizar precio del jugador: ");
                Mbappe.setEstado(precioJugador);
                
                
                break;
            case 4:   
                System.out.println("No se termino....");
                break;
            case 5:   
                System.out.println("No se termino....");
                break;
            case 6:   
                System.out.println("No se termino....");
                break;
            default:
                break;
        }
    }
    
}
