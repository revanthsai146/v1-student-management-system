package net.studentmanagementsystem;

import net.studentmanagementsystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		

		  Student student1 = new Student("Revanth", "Sai", "sai123@gmail.com");
		  studentRepository.save(student1);

		  Student student2 = new Student("Eswar", "Prasad", "Eswar@gmail.com");
		  studentRepository.save(student2);

		  Student student3 = new Student("Giri", "Grag", "Giri@gmail.com");
		  studentRepository.save(student3);
		
	}

}
