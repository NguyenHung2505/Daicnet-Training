package com.daicent.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Clazz {
    private int idClazz;
    private String nameClazz;

    public Clazz() {
    }

    public Clazz(int idClazz, String nameClazz) {
        this.idClazz = idClazz;
        this.nameClazz = nameClazz;
    }

    public int getIdClazz() {
        return idClazz;
    }

    public void setIdClazz(int idClazz) {
        this.idClazz = idClazz;
    }

    public String getNameClazz() {
        return nameClazz;
    }

    public void setNameClazz(String nameClazz) {
        this.nameClazz = nameClazz;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "idClazz=" + idClazz +
                ", nameClazz='" + nameClazz + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return idClazz == clazz.idClazz && nameClazz.equals(clazz.nameClazz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClazz, nameClazz);
    }
}
