package stud;


public class GradeBook {
    private Student[] students;

    public GradeBook() {
        students = new Student[0];
    }

    public void addStudent(Student student) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[students.length] = student;
        students = newStudents;
    }

    public Student findStudentByName(String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                return students[i];
            }
        }
        return null;
    }

    public Student findStudentById(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }

    public void printAllStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].getName() + ", ID: " + students[i].getId() + ", Score: " + students[i].getScore());
        }
    } 
    }

