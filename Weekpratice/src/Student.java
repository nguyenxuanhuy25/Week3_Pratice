    import java.util.Date;
    import java.util.HashMap;
    import java.util.Map;

    public class Student {
        private int idStudent ;
        public String nameStudent ;
        public String dayOfBirthStudent;
        Map<String , Grade> grades ;


        public int getIdStudent() {
            return idStudent;
        }

        public Student(int idStudent , String nameStudent , String dayOfBirthStudent ){
            this.idStudent = idStudent;
            this.nameStudent = nameStudent;
            this.dayOfBirthStudent = dayOfBirthStudent;
            this.grades = new HashMap<>();
        }
        public void updateGrade(String subject, int score, Teacher teacher) {
            if (grades.containsKey(subject)) {
                Grade grade = grades.get(subject);
                if (teacher.teacherSubject(subject)) {
                    grade.setScore(score);
                    grade.setUpdateIn(new Date());
                    grade.setUpdateBy(teacher);
                    System.out.println("Đã cập nhật thành công.");
                } else {
                    System.out.println("Giáo Viên không dạy môn này. Cập nhật điểm không thành công.");
                }
            } else {
                System.out.println("Môn Học không được tìm thấy. Cập nhật điểm không thành công.");
            }
        }
        public void addGrade(String subject, int score) {
            Grade grade = new Grade(score);
            grades.put(subject, grade);
        }

        public void viewGrades() {
            for (Map.Entry<String, Grade> entry : grades.entrySet()) {
                System.out.println("Subject: " + entry.getKey() + " | Score: " + entry.getValue().getScore());
                System.out.println("Updated By: " + entry.getValue().getUpdateBy().getNameTeacher());
                System.out.println("Last Updated: " + entry.getValue().getUpdateIn());
                System.out.println("--------");
            }
        }

    }