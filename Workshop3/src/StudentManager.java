import java.util.ArrayList;

public class StudentManager {

	ArrayList<Student> students = new ArrayList<Student>();
	
	public StudentManager() {
		
	}
	
	public void add(Student addedStudent) {
		for (Student student : students) {
			if(student.getIdentityNumber() == addedStudent.getIdentityNumber()) {
				System.out.println("There exist a student which includes same Identity Number");
				return;
			}
		}
			
		this.students.add(addedStudent);
		System.out.println("Student " + addedStudent.getFirstName() + " added!");

	}
	
	public void delete(int id) {
		Student studentToDelete = new Student();
		for (Student student : students) {
			if(student.getId() == id) {
				studentToDelete = student;
			}
		}
		System.out.println("Student " + studentToDelete.getFirstName() + " is deleted!");
		students.remove(studentToDelete);
	}
	
	public void update(Student updatedStudent) {
		
		for (Student student : students) {
			if(student.getId() == updatedStudent.getId()) {
				students.set(students.indexOf(student), updatedStudent);
				//student = updatedStudent;
				System.out.println("Student " + student.getId() + " is updated");
				break;
			}else {
				System.out.println("There is no updateable student");

			}
				
		}
	}
	
	public void update2(Student updatedStudent) {
        boolean isExist = true;
        for (Student student : students) {
            if (student.getId() == updatedStudent.getId()) {
                students.set(students.indexOf(student), updatedStudent);
                
                student = updatedStudent;
                System.out.println(updatedStudent.getId() + " ID No`lu öğrenci güncellendi!");
                isExist = true;
                break;
            } else {
                isExist = false;
            }
        }
        if (!isExist) {

            System.out.println("Güncellenecek öğrenci bulunamadı! --- Öğrenci güncellenemedi!!!");
        }
    }
	
	public ArrayList<Student> getAll() {
		return this.students;
	}
}
