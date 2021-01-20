package People;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    static int count = 1;
    int id;
    String login;
    String password;
    String firstName;
    String secondName;
    int pesel;
    HashMap<String, Integer> subject;

    public Student(String login, String password, String firstName, String secondName, int pesel) {
        this.id = count++;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.pesel = pesel;
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

    public void setArrayWithSubjects(HashMap<String, Integer> subject) {
        this.subject = subject;
    }

    public void addSubject(String subjectx){
        subject.put(subjectx, 0);
    }

    public void getSubjectByStudent(){
        for (String name: subject.keySet()){
            String key = name.toString();
            String value = subject.get(name).toString();
            System.out.println(key);
        }
    }


    public void getKeysFromValue(HashMap<String, Integer> hm, String value) {
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            if (entry.getValue().equals("c")) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getPesel() {
        return pesel;
    }

    public void createStudent(String login, String password, String firstName, String secondName, int pesel, HashMap<String, Integer> subject){
        setLogin(login);
        setPassword(password);
        setFirstName(firstName);
        setSecondName(secondName);
        setPesel(pesel);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", pesel=" + pesel +
                '}';
    }


}
