package org.bguerra.app.jardin;

import org.bguerra.app.hogar.*;
//import org.bguerra.app.hogar.Gato;
//import org.bguerra.app.hogar.Persona;
import static org.bguerra.app.hogar.Persona.*;
//import static org.bguerra.app.hogar.Persona.saludar;
//import static org.bguerra.app.hogar.Persona.GENERO_FEMENINO;
//import static org.bguerra.app.hogar.Persona.GENERO_MASCULINO;
import static org.bguerra.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        //org.bguerra.app.hogar.Persona p = new org.bguerra.app.hogar.Persona();
        Persona p = new Persona();
        p.setNombre("Brian");
        p.setApellido("Guerra");
        //p.setColorPelo(ColorPelo.CAFE);
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("Jugando = " + jugando);
        //String saludo = Persona.saludar();
        String saludo = saludar();
        System.out.println("Saludo = " + saludo);
        //String generoMujer = Persona.GENERO_FEMENINO;
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}