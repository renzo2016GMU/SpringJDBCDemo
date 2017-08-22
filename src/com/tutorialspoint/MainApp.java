package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        File curDir = new File(".");
        getAllFiles(curDir);

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

        System.out.println("------Records Creation--------");
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 11);
        studentJDBCTemplate.create("Juan", 14);
        studentJDBCTemplate.create("Yesi", 17);
        studentJDBCTemplate.create("Tommy", 17);

        System.out.println("------Listing Multiple Records--------");
        List<Student> students = studentJDBCTemplate.listStudents();

        for (Student record : students) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----");
        studentJDBCTemplate.update(2, 20);

        System.out.println("----Listing Record with ID = 2 -----");
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId());
        System.out.print(", Name : " + student.getName());
        System.out.println(", Age : " + student.getAge());
    }

    private static void getAllFiles(File curDir) {
        File[] filesList = curDir.listFiles();
        for (File f : filesList) {
            if (f.isDirectory())
                getAllFiles(f);
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }

    }
}