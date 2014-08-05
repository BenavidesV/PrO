/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Listas;

import Nodos.NodoEquipo;
import Nodos.NodoJugador;

/**
 *
 * @author Jose E & Alvaro
 */
public class Equipos {
    
    private NodoEquipo raiz;
    
    public void Insertar(String nombre,Jugadores jugadores)
    {
        NodoEquipo nuevo;
        nuevo=new NodoEquipo();
        nuevo.setNombre(nombre);
        nuevo.setJugadores(jugadores.getListaJugadores());
        if(getRaiz()==null)
        {
            nuevo.setSiguienteEquipo(null);
            setRaiz(nuevo);
        }
        else
        {
            NodoEquipo auxiliar=getRaiz();
            while (auxiliar.getSiguienteEquipo()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteEquipo();             
            }
            auxiliar.setSiguienteEquipo(nuevo);
        }        
    }
    
    public void Imprimir()
    {
        NodoEquipo recorridoEquipo=getRaiz();
        
        System.out.println("Listado de todos los elementos de la lista");
        while(recorridoEquipo!=null)
        {
            System.out.println(recorridoEquipo.getNombre());
            
            NodoJugador recorridoJugadores=recorridoEquipo.getJugadores();
            while(recorridoJugadores!=null)
            {
                System.out.println(recorridoJugadores.getNombre() + " " +recorridoJugadores.getEdad());
                recorridoJugadores=recorridoJugadores.getSiguienteJugador();
            }
            recorridoEquipo=recorridoEquipo.getSiguienteEquipo();
        }
        System.out.println();
    }
    
    public boolean EstaVacia()
    {
        return getRaiz()==null;
    }

    /**
     * @return the raiz
     */
    public NodoEquipo getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoEquipo raiz) {
        this.raiz = raiz;
    }
}
