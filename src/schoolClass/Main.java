package schoolClass;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {



        Teacher t1 = new Teacher("Suter","Kuat", LocalDate.parse("1975-11-18"),"test2@test.com", 1);

        Student s1 = new Student("Meier","Gustav", LocalDate.parse("1997-10-20"),"test@test.com", "wup20",122);
        Student s2 = new Student("Amburg","Schwimon", LocalDate.parse("1998-01-16"),"test3@test.com", "wup20",123);

        Student[] studentlist = {s1,s2};

        Subject bio = new Subject("Biologie", 5, 3);

        Subject[] subjectlist = {bio};

        SchoolClass c1 = new SchoolClass(studentlist, 0, t1, subjectlist);

    }

}
