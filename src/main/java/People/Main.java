package People;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Student x = new Student("Maciek", "123abc", "Maciek", "Kowalski", 00000000);
        x.setArrayWithSubjects(new HashMap<String, Integer>());
        x.addSubject("Biology");
        x.addSubject("Math");
        x.getSubjectByStudent();






    }
}