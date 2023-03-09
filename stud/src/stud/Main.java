package stud;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        GradeBook gradeBook = new GradeBook();
	        gradeBook.addStudent(new Student("Tom", 1, 90.0));
	        gradeBook.addStudent(new Student("Jerry", 2, 85.0));
	        gradeBook.addStudent(new Student("Mickey", 3, 95.0));

	        // 按姓名查找学生
	        Student student1 = gradeBook.findStudentByName("Tom");
	        System.out.println("Name: " + student1.getName() + ", ID: " + student1.getId() + ", Score: " + student1.getScore());

	        // 按学号查找学生
	        Student student2 = gradeBook.findStudentById(2);
	        System.out.println("Name: " + student2.getName() + ", ID: " + student2.getId() + ", Score: " + student2.getScore());

	        // 打印所有学生的信息
	        gradeBook.printAllStudents();

}

}
