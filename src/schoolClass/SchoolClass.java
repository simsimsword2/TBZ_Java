package schoolClass;

public class SchoolClass {

    private Student[] studentlist;
    private int classrep;
    private Teacher mainteacher;
    private Subject[] subjectlist;

    public SchoolClass(Student[] studentlist, int classrep, Teacher mainteacher, Subject[] subjectlist) {
        this.studentlist = studentlist;
        this.classrep = classrep;
        this.mainteacher = mainteacher;
        this.subjectlist = subjectlist;
    }

}
