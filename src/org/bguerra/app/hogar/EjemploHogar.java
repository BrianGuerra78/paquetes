package org.bguerra.app.hogar;

import org.bguerra.app.jardin.Perro;
import static org.bguerra.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro= new Perro();
        //String saludo = Persona.saludar();
        String saludo = saludar();
    }
}
