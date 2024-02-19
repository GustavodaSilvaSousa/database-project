package model.dao;

import db.DataBase;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DataBase.getConnection());
	}
	public static DepartmentDaoJDBC createDepatmentDao() {
		return new DepartmentDaoJDBC(DataBase.getConnection());
	}
}
