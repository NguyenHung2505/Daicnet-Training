package com.daicent.main;

import com.daicent.model.Clazz;
import com.daicent.model.School;
import com.daicent.model.Student;
import com.daicent.model.Subject;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Map<Integer , String> myMap = new HashMap<>();
        // thêm phần tử : put()
//        myMap.put(1 , "one");
//        myMap.put(2 , "two");
//        myMap.put(3 , "three");
        // lấy giá trị của key
//        System.out.println(myMap.get(3));
//        Map<Integer , String> myMap2 = new HashMap<>();
//        myMap.put(4 , "bon");
//        myMap.put(5 , "nam");
//        myMap.putAll(myMap2);
        // xóa hết phần tử của map
//        myMap.clear();
        // kiểm tra kích thước map
//        System.out.println(myMap.size());
        // kiểm tra phần tử có trong map không bằng key
//        System.out.println(myMap.containsKey(3));
        //kiểm tra phần tử có trong map không bằng valua
//        System.out.println(myMap.containsValue("bon"));
        // duyệt phần tử trong map
//        for (Integer key: myMap.keySet()
//             ) {
//            System.out.println(myMap.get(key));
//        }

        Student student1 = new Student(1,"hung1",29,8.1);
        Student student2 = new Student(2,"hung2",31,6.1);
        Student student3 = new Student(3,"hung3",18,9.1);

        Clazz clazz1 = new Clazz(1,"1A");
        Clazz clazz2 = new Clazz(2,"2A");
        Clazz clazz3 = new Clazz(3,"3A");

        School school1 = new School(1,"Rikkei");
        School school2 = new School(2,"Daicent");
        School school3 = new School(3,"Kingkong");

        Subject subject1 = new Subject(1,"Java");
        Subject subject2 = new Subject(2,"Angulare");
        Subject subject3 = new Subject(3,"DJBC");

        TreeSet<Student> students = new TreeSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println("====List Student===");
        System.out.println(students);

        Student pointMax = students.last();
        Student pointMin = students.first();
        System.out.println("==Max point==");
        System.out.println(pointMax);
        System.out.println("==Min point==");
        System.out.println(pointMin);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        Student max = new Student();
        max = student1;
        if(student2.getCoreAvg() > max.getCoreAvg()){
            max = student2;
        }
        if(student3.getCoreAvg() > max.getCoreAvg()){
            max = student3;
        }
        // số điểm trung bình cao nhất
        System.out.println("\n" +
                "The student with the highest score : " + max.getCoreAvg());


        System.out.println("==Sort Age==");
        System.out.println("==Sort Age Increment==");
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAgeStudent() - o2.getAgeStudent();
            }
        });

        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println("==Sort Age decrement==");

        // tuổi giảm dần
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAgeStudent() - o1.getAgeStudent();
            }
        });
        for (Student s : studentList) {
            System.out.println(s);
        }




   }
}
