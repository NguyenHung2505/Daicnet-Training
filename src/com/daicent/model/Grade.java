package com.daicent.model;

public class Grade {
    private int idGrade;
    private String nameGrade;

    public Grade() {
    }

    public Grade(int idGrade, String nameGrade) {
        this.idGrade = idGrade;
        this.nameGrade = nameGrade;
    }

    public int getIdGrade() {
        return idGrade;
    }

    public void setIdGrade(int idGrade) {
        this.idGrade = idGrade;
    }

    public String getNameGrade() {
        return nameGrade;
    }

    public void setNameGrade(String nameGrade) {
        this.nameGrade = nameGrade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "idGrade=" + idGrade +
                ", nameGrade='" + nameGrade + '\'' +
                '}';
    }
}
