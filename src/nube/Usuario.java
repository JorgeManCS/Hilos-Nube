/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nube;

/**
 *
 * @author JorgeManuel
 */
public class Usuario {
    private String nombre;
    private int[] numeroArchivos;

    public Usuario(String nombre, int[] numeroArchivos) {
        this.nombre = nombre;
        this.numeroArchivos = numeroArchivos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getNumeroArchivos() {
        return numeroArchivos;
    }

    public void setNumeroArchivos(int[] numeroArchivos) {
        this.numeroArchivos = numeroArchivos;
    }

}
