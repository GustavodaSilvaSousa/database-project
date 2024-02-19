package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentTest {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepatmentDao();
		System.out.println("=== Test 1: department insertion ===");
		Department dep = new Department(null, "Cosmetics");
		
		System.out.println("=== Test 2: department deleted by id ===");
		depDao.deleteById(5);
		
		System.out.println("=== Test 3: department find by id ===");
		System.out.println(depDao.findById(1));
		
		System.out.println("=== Test 4: department update by id ===");
		Department dep2 = depDao.findById(6);
		dep2.setName("Paints");
		depDao.update(dep2);
		
		System.out.println("=== Test 5: department find all ===");
		System.out.println(depDao.findAll());
		
	}

}
