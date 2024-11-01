package com.sid.service;

import com.sid.dao.MobileDao;
import com.sid.entity.Product;

public class MobileService {

	public static String addProductService(Product[] add) {

		String addproduct = MobileDao.addProductDao(add);
		return addproduct;
	}

	public static Product[] getAllProductService() {

		Product[] allproducts = MobileDao.getAllProductDao();

		return allproducts;

	}

	public static String updateProductService(int oldid) {

		String updateproducts = MobileDao.updateProductDao(oldid);

		return updateproducts;

	}

	public static String deleteProductService(int delid) {
		String deleteproducts = MobileDao.deleteProductDao(delid);

		return deleteproducts;
	}

}
