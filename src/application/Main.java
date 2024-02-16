package application;

import java.util.Date;
import java.text.ParseException;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {
	public static void main(String[] args) throws ParseException {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== Test 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("=== Test 2: seller findByDepartment");
		Department dep = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("=== Test 3: seller findAll");
		
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		String name = "Gustavo Silva";
		String email = "gustavo@gmail.com";
		Seller seller2 = new Seller (null,name, email, 
				new Date(), 4300.0, dep);
		
		sellerDao.insert(seller2);
	}
}
