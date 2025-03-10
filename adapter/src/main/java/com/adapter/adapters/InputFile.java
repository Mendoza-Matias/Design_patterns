package com.adapter.adapters;

import java.io.InputStream;
import java.util.List;

import com.adapter.models.Person;

public interface InputFile {
    List<Person> readFile(InputStream inputStream); //metodo para leer un archivo
}
