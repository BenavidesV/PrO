/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Listas;

import Nodos.NodoEquipo;
import Nodos.NodoJugador;
import Nodos.NodoPartidos;

/**
 *
 * @author Jose E & Alvaro
 */
public class Partidos {
    private NodoPartidos calendario;
    
    
    public void Insertar(String local,String visita, String fecha,
            String hora,String sede, String golesV, String golesL)
    {
        NodoPartidos nuevo;
        nuevo=new NodoPartidos();
        nuevo.setFecha(fecha);
        nuevo.setHora(hora);
        nuevo.setLocal(local);
        nuevo.setVisita(visita);
        nuevo.setSede(sede);
        nuevo.setGolesL(golesL);
        nuevo.setGolesV(golesV);
        
        if(calendario==null)
        {
            nuevo.setSiguientePartido(null);
            calendario=nuevo;
        }
        else
        {
            NodoPartidos auxiliar=nuevo;
            while (auxiliar.getSiguientePartido()!=null) 
            {  
                auxiliar=auxiliar.getSiguientePartido();             
            }
            auxiliar.setSiguientePartido(nuevo);
        }        
    }
    
    public void Imprimir()
    {
        NodoPartidos recorridoP=calendario.getCalendario();
        
        System.out.println("Listado de todos los elementos de la lista");
        while(recorridoP!=null)
        {
            System.out.println(recorridoP.getCalendario());
            System.out.println(recorridoP.getLocal()+recorridoP.getGolesL());
            System.out.println(recorridoP.getVisita()+recorridoP.getGolesV());
            recorridoP=recorridoP.getSiguientePartido();
        }
        System.out.println();
    }
    
    public boolean EstaVacia()
    {
        return calendario.getCalendario()==null;
    }
    
}
