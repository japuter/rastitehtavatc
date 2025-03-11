package week5_inclass;
public class MainApp {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        Student student = new Student("John Doe", "john.doe@example.com");
        TimeSpent time1 = new TimeSpent(2, 3, 1);
        student.addTimeSpent(time1);

        studentDAO.addStudent(student);

        Student retrievedStudent = studentDAO.findStudent(student.getId());
        System.out.println("Retrieved: " + retrievedStudent.getName());

        retrievedStudent.setEmail("john.newemail@example.com");
        studentDAO.updateStudent(retrievedStudent);
    }
}
