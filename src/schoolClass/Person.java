package schoolClass;

import java.time.LocalDate;

public class Person {

    private String name;
    private String firstname;
    private LocalDate dateofbirth;
    private String email;

    public Person(String name, String firstname, LocalDate dateofbirth, String email) {
        this.name = name;
        this.firstname = firstname;
        this.dateofbirth = dateofbirth;
        this.email = email;
    }
}
