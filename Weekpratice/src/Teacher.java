import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private int idTeacher ;
    public String nameTeacher ;
    public String dayOfBirthTeacher ;
    public List<String> subject;

    public int getIdTeacher() {
        return idTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public Teacher(int idTeacher , String nameTeacher , String dayOfBirthTeacher){
        this.idTeacher = idTeacher ;
        this.nameTeacher = nameTeacher ;
        this.dayOfBirthTeacher = dayOfBirthTeacher;
        this.subject = new ArrayList<>();
    }
    public boolean teacherSubject(String subject){
        return subject.contains(subject);
    }


}