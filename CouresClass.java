
public class CouresClass {
    String courseName;
    String enrolledStudent;
    static int maxCapacity;

    public void enrollStudent(String studentName) {
        this.enrolledStudent = studentName;
        System.out.println(this.enrolledStudent);
        maxCapacity--;
    }

    public void unenrollStudent(String studenName) {
        this.enrolledStudent = studenName;
        System.out.println(studenName);
        maxCapacity++;
    }

    static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

}
