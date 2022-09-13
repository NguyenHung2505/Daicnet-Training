package com.daicent.model;

import java.util.Objects;
import java.util.Scanner;

public class Student implements Comparable<Student>{
    private int idStudent;
    private String nameStudent;
    private int ageStudent;
    private double coreAvg;

    public Student() {
    }

    public Student(int idStudent, String nameStudent, int ageStudent, double coreAvg) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
        this.coreAvg = coreAvg;
    }




    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

    public double getCoreAvg() {
        return coreAvg;
    }

    public void setCoreAvg(double coreAvg) {
        this.coreAvg = coreAvg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", ageStudent=" + ageStudent +
                ", coreAvg=" + coreAvg +
                '}';
    }

    // lấy giá trị để gọi đến khi dùng để so sánh bằng hoặc khác
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idStudent == student.idStudent && ageStudent == student.ageStudent && Double.compare(student.coreAvg, coreAvg) == 0 && nameStudent.equals(student.nameStudent);
    }

    // hàng băm đưa giá trị thành 1 dẫy số
    @Override
    public int hashCode() {
        return Objects.hash(idStudent, nameStudent, ageStudent, coreAvg);
    }


    @Override
    public int compareTo(Student o) {
        return this.getNameStudent().compareTo(o.getNameStudent());
    }
}
