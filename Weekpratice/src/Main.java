import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        Map<Integer, Teacher> teachers = new HashMap();

        Student student = new Student(1, "Student 1", "01/01/2000");
        Teacher teacher = new Teacher(1, "Teacher 1", "01/01/1980");

        students.put(student.getIdStudent(), student);
        teachers.put(teacher.getIdTeacher(), teacher);

        // Thêm điểm cho môn học Math cho sinh viên student
        student.addGrade("Toán", 85);
        student.addGrade("Sinh Học", 85);

        // Cập nhật điểm cho môn học Math (chỉ giáo viên dạy Math mới có quyền)
        student.updateGrade("Toán", 95, teacher);
        student.updateGrade("Sinh Học", 90, teacher);

        // Xem điểm của sinh viên sau khi cập nhat
        student.viewGrades();
    }
}