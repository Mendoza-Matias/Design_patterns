package com.patrones;

public class Main {
    public static void main(String[] args) {

        DatabaseConnector db = DatabaseConnector.getIntance(); // obtengo la intancia

        System.out.println(db);

        // siempre retornara la misma instancia

        DatabaseConnector db2 = DatabaseConnector.getIntance();

        System.out.println(db2);
    }
}