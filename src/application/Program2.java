package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1 :  findById === ");
		Department department = departmentDao.findById(3);
		System.out.println(department);

		
		System.out.println("\n=== TEST 2 :  findByDepartment === ");
		List<Department> list = departmentDao.findall();
		for(Department all : list) {
			System.out.println(all);
		}

		
		System.out.println("\n=== TEST 4 : seller insert === ");
		Department newDepartment = new Department(null,"Orkut");
		departmentDao.insert(newDepartment);
		System.out.println(" Inserted! New id = " + newDepartment.getId());
		
		
		System.out.println("\n=== TEST 5 :  update === ");
		department = departmentDao.findById(8);
		department.setName("Facebook");
		departmentDao.update(department);
		System.out.println(" Completed! ");
	
		
		
		
		System.out.println("\n===  :  delete === ");
		System.out.println("Enter  id  for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");


		sc.close();
	}
	
}


