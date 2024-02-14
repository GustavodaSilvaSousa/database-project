package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	public void insert(Department obj);

	public void update(Seller obj);

	public void deleteById(Seller id);

	Seller findById(Integer id);

	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
