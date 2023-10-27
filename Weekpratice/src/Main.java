import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        Map<Integer, Teacher> teachers = new HashMap();

        Student student = new Student(1, "Student 1", "01/01/2000");
        Student student1 = new Student(2, "Student 2", "02/02/2002");
        Teacher teacher = new Teacher(1, "Teacher 1", "01/01/1980");
        Teacher teacher1 = new Teacher(2, "Teacher 2", "02/02/1922");

        students.put(student.getIdStudent(), student);
        students.put(student1.getIdStudent(), student);

        teachers.put(teacher.getIdTeacher(), teacher);
        teachers.put(teacher1.getIdTeacher(), teacher);

        // Thêm điểm cho môn học Math cho sinh viên student
        student.addGrade("Toán", 85);
        student.addGrade("Sinh Học", 85);
        student1.addGrade("Toán" , 80);
        student1.addGrade("Sinh Học" , 80);

        // Cập nhật điểm cho môn học Math (chỉ giáo viên dạy Math mới có quyền)
        student.updateGrade("Toán", 95, teacher);
        student1.updateGrade("Toán", 95, teacher1);
        student.updateGrade("Sinh Học", 90, teacher);
        student1.updateGrade("Sinh Học", 90, teacher1);

        // Xem điểm của sinh viên sau khi cập nhat
        student.viewGrades();
        student1.viewGrades();
    }
}