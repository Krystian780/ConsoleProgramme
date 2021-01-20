package People;
import java.util.ArrayList;


public class Professor {
    static int count = 1;
    int id;
    String login;
    String password;
    String firstName;
    String secondName;
    int pesel;
    ArrayList<Student> students;

    public Professor(String login, String password, String firstName, String secondName, int pesel, ArrayList<Student> students) {
        this.id = count++;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.pesel = pesel;
        this.students = students;
    }

    public static void setCount(int count) {
        Professor.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student x){
        students.add(x);
    }

    public void printAllSubjects(Student x){
        x.getSubjectByStudent();
    }
}
