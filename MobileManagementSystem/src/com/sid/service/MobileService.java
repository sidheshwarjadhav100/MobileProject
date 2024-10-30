package com.sid.service;

import com.sid.dao.MobileDao;
import com.sid.entity.Product;

public class MobileService {

	public static Product[] addProductService(Product[] add) {

		Product[] addproduct = MobileDao.addProductDao(add);
		return null;
	}

	public static Product[] getAllProductService() {

		Product[] allproducts = MobileDao.getAllProductDao();

		return allproducts;

	}

	public static String updateProductService(int oldid) {

		String updateproducts = MobileDao.updateProductDao(oldid);

		return updateproducts;

	}

	public static Product[] deleteProductService(int delid) {
		Product[] deleteproducts = MobileDao.deleteProductDao(delid);

		return null;
	}

}
