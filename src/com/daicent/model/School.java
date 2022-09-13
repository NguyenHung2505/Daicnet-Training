package com.daicent.model;

import java.util.Objects;

public class School {
     private int idSchool;
    private String nameSchool;

    public School() {
    }

    public School(int idSchool, String nameSchool) {
        this.idSchool = idSchool;
        this.nameSchool = nameSchool;
    }

    public int getIdSchool() {
        return idSchool;
    }

    public void setIdSchool(int idSchool) {
        this.idSchool = idSchool;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    @Override
    public String toString() {
        return "School{" +
                "idSchool=" + idSchool +
                ", nameSchool='" + nameSchool + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return idSchool == school.idSchool && Objects.equals(nameSchool, school.nameSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSchool, nameSchool);
    }
}
