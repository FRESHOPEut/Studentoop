
public class Main {

	public static void main(String[] args) {
		StudentManager manager =new StudentManager();
        Student ogrenci1 = new Student(1, "Ali", "Demir", "4596846");
        Student ogrenci2 = new Student(2, "Veli", "Çam", "3456346");
        Student ogrenci3 = new Student(3, "Ahmet", "Ay", "9654546");
        
        System.out.println("Student addition process");
        manager.add(ogrenci1);
        manager.add(ogrenci2);
        manager.add(ogrenci3);
        manager.add(ogrenci1);
        System.out.println("Total student number is " + manager.getAll().size());
        System.out.println("------");
        
        System.out.println("Checking students");
        for (Student student : manager.students) {
			System.out.println(student.getId() + " " + student.getFirstName() + " "
					+ student.getLastName() + " " + student.getIdentityNumber());
		}        
		System.out.println("------"); 
		
		System.out.println("Deleting a student");
		manager.delete(3);
		for (Student student : manager.students) {
			System.out.println(student.getId() + " " + student.getFirstName() + " "
					+ student.getLastName() + " " + student.getIdentityNumber());
		}
		System.out.println("Total student number is " + manager.getAll().size());
		System.out.println("------");
		
		Student ogrenciX = new Student(1, "Mehmet", "Demir", "4596846");
		manager.update(ogrenciX);
		for (Student student : manager.students) {
			System.out.println(student.getId() + " " + student.getFirstName() + " "
					+ student.getLastName() + " " + student.getIdentityNumber());
		}
		System.out.println("Total student number is " + manager.getAll().size());
		System.out.println("------");
		
		System.out.println(manager.students.get(0).getFirstName());
	}

}
