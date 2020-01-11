/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.jesus;

/**
 *
 * @author Jesus
 */
public class Jugador {

    private String nombre; // Nombre del jugador de fútbol

    private int votos; // Votos recibidos en la aplicación	

    private int id; // Número único identificativo

    public Jugador(String nombre, int votos, int id) {
        this.nombre = nombre;
        this.votos = votos;
        this.id = id;
    }
    
    

}
