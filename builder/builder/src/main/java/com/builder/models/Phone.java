package com.builder.models;

public class Phone {
    private String number;
    private String ext;
    private String type;

    public Phone() {
    }

    public Phone(String number, String ext, String type) {
        this.number = number;
        this.ext = ext;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Phone [number=" + number + ", ext=" + ext + ", type=" + type + "]";
    }
}
