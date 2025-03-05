package com.patrones;

/*
 * Rules
 * 1) Debemos tener un constructor privado
 * 2) Debemos tener un atributo privado estatico 
 * 3) Debemos tener un metodo estatico que devuelva la intancia
 */
public class DatabaseConnector {
    //crea la instancia dentro de la propia clase 
    
    private static DatabaseConnector intance; // unico objeto que vamos a manejar

    private DatabaseConnector() {
        System.out.println("Creating object");
    }

    public static DatabaseConnector getIntance() {
        if (intance == null) //declaro mi instancia
            intance = new DatabaseConnector();
        return intance;
    }
}
