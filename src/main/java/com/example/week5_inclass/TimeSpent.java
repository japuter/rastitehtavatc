package week5_inclass;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "time_spent")
public class TimeSpent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int homeworkHours;
    private int inClassHours;
    private int theoryHours;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public TimeSpent() {}

    public TimeSpent(int homeworkHours, int inClassHours, int theoryHours) {
        this.homeworkHours = homeworkHours;
        this.inClassHours = inClassHours;
        this.theoryHours = theoryHours;
    }

    public Long getId() {
        return id;
    }

    public int getHomeworkHours() {
        return homeworkHours;
    }

    public void setHomeworkHours(int homeworkHours) {
        this.homeworkHours = homeworkHours;
    }

    public int getInClassHours() {
        return inClassHours;
    }

    public void setInClassHours(int inClassHours) {
        this.inClassHours = inClassHours;
    }

    public int getTheoryHours() {
        return theoryHours;
    }

    public void setTheoryHours(int theoryHours) {
        this.theoryHours = theoryHours;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
