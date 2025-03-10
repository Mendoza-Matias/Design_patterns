package com.adapter.adapters;

import java.io.InputStream;
import java.util.List;

import com.adapter.models.Person;

//recibe cualquier tipo de adaptador
public class FileAdapter {
    private InputFile inputFile; //recibe cualquier clase que implemente esta interfaz

    public FileAdapter(InputFile inputFile) {
        this.inputFile = inputFile;
    }

    public List<Person> readFile(InputStream inputStream) {
        return inputFile.readFile(inputStream);
    }
}
