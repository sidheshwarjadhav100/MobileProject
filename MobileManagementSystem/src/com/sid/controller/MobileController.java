package com.sid.controller;

import com.sid.entity.Product;
import com.sid.service.MobileService;

public class MobileController {

	public static Product[] addProductcontroler(Product[] add) {

		Product[] addproduct = MobileService.addProductService(add);

		return addproduct;

	}

	public static Product[] getAllMobilesController() {

		Product[] allproducts = MobileService.getAllProductService();

		return allproducts;

	}

	public static Product[] updateMobilesController(int oldid) {

		Product[] updateproducts = MobileService.updateProductService(oldid);

		return updateproducts;
	}

	public static Product[] deleteMobilesController(int delid) {
		Product[] deleteproducts = MobileService.deleteProductService(delid);
		return null;

	}

}
