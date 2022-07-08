/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Persona est1 = new Persona("Jose Miguel", 20);
        Persona est2 = new Persona("Paula", 19);
        Persona est3 = new Persona("Claudia", 21);
        Persona est4 = new Persona("Daniela", 22);

        ArrayList<Persona> listado = new ArrayList<>();
        listado.add(est1);
        listado.add(est2);
        listado.add(est3);
        listado.add(est4);
        
        OperacionesEstudiantes operaciones = new OperacionesEstudiantes();
        operaciones.establecerEstudiante(listado);
        operaciones.establecerPromedioEdades();
        
        System.out.printf("%s\n", operaciones);
         
    }
    
}
