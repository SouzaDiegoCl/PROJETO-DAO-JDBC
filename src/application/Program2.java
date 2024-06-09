package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department Insert ===");		
		Department newDep = new Department(null, "Novo");
		departmentDao.insert(newDep);
		System.out.println("Seller inserted! Object Id = " + newDep.getId());		
	
		System.out.println("=== TEST 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();	
		for(Department dep:list) {
			System.out.println(dep);
		}
		

		
	}

}
