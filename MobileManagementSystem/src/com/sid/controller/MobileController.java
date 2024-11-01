package com.sid.controller;

import com.sid.entity.Product;
import com.sid.service.MobileService;

public class MobileController {

	public static String addProductcontroler(Product[] add) {

		String addproduct = MobileService.addProductService(add);

		return addproduct;

	}

	public static Product[] getAllMobilesController() {

		Product[] allproducts = MobileService.getAllProductService();

		return allproducts;

	}

	public static String updateMobilesController(int oldid) {

		String updateproducts = MobileService.updateProductService(oldid);

		return updateproducts;
	}

	public static String deleteMobilesController(int delid) {
		String deleteproducts = MobileService.deleteProductService(delid);
		return deleteproducts;

	}

}
