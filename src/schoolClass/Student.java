package schoolClass;

import java.time.LocalDate;

public class Student extends Person {

    private String schoolclass;
    private int studentnumber;

    public Student(String name, String firstname, LocalDate dateofbirth, String email, String schoolclass, int studentnumber) {
        super(name, firstname, dateofbirth, email);
        this.schoolclass = schoolclass;
        this.studentnumber = studentnumber;
    }
}
