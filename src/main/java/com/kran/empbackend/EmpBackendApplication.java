package com.kran.empbackend;

import com.kran.empbackend.model.Employee;
import com.kran.empbackend.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmpBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmpBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		// Employee employee = new Employee();
		// employee.setFirstName("Anup");
		// employee.setLastName("Sasi");
		// employee.setEmailId("anup12una@gmail.com");
		// employeeRepository.save(employee);

		// Employee employee1 = new Employee();
		// employee1.setFirstName("Arya");
		// employee1.setLastName("Sasi");
		// employee1.setEmailId("arya12una@gmail.com");
		// employeeRepository.save(employee1);

	}

}
