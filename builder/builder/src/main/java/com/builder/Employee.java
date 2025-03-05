package com.builder;

import java.util.ArrayList;
import java.util.List;

import com.builder.models.Address;
import com.builder.models.Contact;
import com.builder.models.Phone;
import com.builder.utils.IBuilder;

public class Employee {

    // Atributos de la clase Employee
    private int age;
    private String name;
    private String gender;
    private Address address;
    private List<Phone> phones = new ArrayList<>();
    private List<Contact> contacts = new ArrayList<>();

    // Constructor vacío de Employee
    public Employee() {
    }

    // Constructor con parámetros para inicializar todos los atributos de Employee
    public Employee(int age, String name, String gender, Address address, List<Phone> phones, List<Contact> contacts) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phones = phones;
        this.contacts = contacts;
    }

    // Métodos getter y setter para cada atributo
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    // Método toString para mostrar la información de Employee de manera legible
    @Override
    public String toString() {
        return "Employee [age=" + age + ", name=" + name + ", gender=" + gender + ", address=" + address + ", phones="
                + phones + ", contacts=" + contacts + "]";
    }

    // Clase interna estática EmployeeBuilder para construir objetos Employee
    public static class EmployeeBuilder implements IBuilder {

        // Atributos del builder que coinciden con los atributos de Employee
        private int age;
        private String name;
        private String gender;
        private Address address;
        private List<Phone> phones = new ArrayList<>();
        private List<Contact> contacts = new ArrayList<>();

        // Constructor vacío del builder
        public EmployeeBuilder() {
        }

        // Métodos para establecer valores en el builder y permitir la creación fluida
        // del objeto

        // Establece la edad del empleado y retorna el builder para seguir encadenando
        // métodos
        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this; // Retorna el objeto builder para continuar con la construcción
        }

        // Establece el nombre del empleado y retorna el builder para continuar con la
        // construcción
        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        // Establece el género del empleado y retorna el builder para continuar con la
        // construcción
        public EmployeeBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        // Establece la dirección del empleado y retorna el builder para continuar con
        // la construcción
        public EmployeeBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        // Agrega un teléfono a la lista de teléfonos del empleado y retorna el builder
        public EmployeeBuilder setPhone(Phone phone) {
            this.phones.add(phone);
            return this;
        }

        // Agrega un contacto a la lista de contactos del empleado y retorna el builder
        public EmployeeBuilder setContact(Contact contact) {
            this.contacts.add(contact);
            return this; /*
                          * Retornar 'this' permite encadenar métodos de forma fluida.
                          * Esto significa que puedes seguir configurando el objeto 'EmployeeBuilder'
                          * sin tener que volver a referenciarlo. El método retorna la misma instancia
                          * del
                          * builder, por lo que puedes continuar llamando otros métodos para seguir
                          * agregando propiedades al objeto.
                          * Ejemplo de encadenamiento:
                          * builder.setAge(30).setName("John").setGender("Male").setContact(contact);
                          */
        }

        // Método build() para crear el objeto Employee con los valores establecidos en
        // el builder
        @Override
        public Employee build() {
            // Retorna una nueva instancia de Employee con los valores establecidos
            return new Employee(age, name, gender, address, phones, contacts);
        }
    }
}
