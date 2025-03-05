package com.prototype.utils;

/**
 * Interfaz que define el contrato para las clases que soportan el patrón de diseño Prototype.
 * Las clases que implementen esta interfaz deben ser capaces de realizar una clonación superficial
 * (clonación simple) y una clonación profunda de sus instancias.
 * 
 * @param <T> Tipo de objeto que implementa esta interfaz, utilizado para asegurar que
 *            los métodos de clonación devuelvan el tipo correcto.
 */
public interface IPrototype<T extends IPrototype> extends Cloneable {

    /**
     * Realiza una clonación superficial del objeto.
     * En una clonación superficial, se crea una nueva instancia del objeto con los mismos valores,
     * pero las referencias a objetos internos no se duplican. Si el objeto contiene referencias a otros objetos
     * mutables, esas referencias seguirán apuntando a los mismos objetos.
     * 
     */
    T clone();

    /**
     * Realiza una clonación profunda del objeto.
     * En una clonación profunda, se crean nuevas instancias para todos los objetos internos del objeto original,
     * garantizando que no se compartan referencias con el objeto original. Esto es útil cuando se tiene
     * objetos mutables dentro de la clase que deben ser clonados independientemente.
     * 
     */
    T deepClone();
}
