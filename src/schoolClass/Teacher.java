package schoolClass;

import java.time.LocalDate;

public class Teacher extends Person {

    private float roomnumber;

    public Teacher(String name, String firstname, LocalDate dateofbirth, String email, float roomnumber) {
        super(name, firstname, dateofbirth, email);
        this.roomnumber = roomnumber;
    }

}
