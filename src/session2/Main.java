package session2;

import session1.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Car c = new Car();

        Human h = new Human();
        h.run(5);
        h.run("chó đuổi");
        h.run(12, "asd");

        Human h2 = new Human("asd");
        System.out.println(h2.name);

        Scanner sc = new Scanner(System.in);

        Student s = new Student("asd","987","asdfd",12);
        s.girlFrienfs[0] = "cvb";
        s.myCar = new Car();

        int[] mark = new int[4];
        mark[0] = 18;

        Student[] students = new Student[10];
        Car c0 = new Car();
        c0.brand = "honda";
        students[0] = new Student("asd","987","asdfd",12);

        for (int i=0;i<students.length;i++){
            students[i] = new Student();
        }

        //set 10 sv theo do tuoi tu 20-29
        for (int i=0;i<students.length;i++){
            students[i].setAge(i+20);
        }

        for (int i=0;i<students.length;i++){
            System.out.println(students[i].getAge());
        }

        for (Student st : students){
            System.out.println(st.getAge()); // st <=> student[i]
        }

    }
}
