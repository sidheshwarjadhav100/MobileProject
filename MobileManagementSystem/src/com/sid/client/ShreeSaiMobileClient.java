package com.sid.client;

import java.util.Scanner;

import com.sid.controller.MobileController;
import com.sid.dao.MobileDao;
import com.sid.entity.Product;

public class ShreeSaiMobileClient {


		public static void main(String[] args) {
			Product pobj = new Product();
			Product[] allproduct = new Product[5];

			while (true) {

				System.out.println("---------------------------");
				System.out.println("            Menu           ");
				System.out.println("---------------------------");

				System.out.println("1. Add Product into Data Base");
				System.out.println("2. Display Product from Data Base");
				System.out.println("3. Update Product into Data Base");
				System.out.println("4. Delete Product from Data Base");
				System.out.println("5. Exit");
				System.out.println();

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Choice");
				int choice = sc.nextInt();

				switch (choice) {

				case 1: {

					System.out.println("Enter How Many Table do You Want To Add");
					int capacity = sc.nextInt();
					new MobileDao(capacity);// pass constructor
					Product[] addproduct = new Product[capacity];

					for (int i = 0; i < capacity; i++) {

						int id = 0;
						String cname = null;
						String series = null;
						int price = 0;

						System.out.println("Enter id");
						id = sc.nextInt();
						System.out.println("Enter Company name");
						cname = sc.next();
						System.out.println("Enter Series ");
						series = sc.next();
						System.out.println("enter price");
						price = sc.nextInt();

						addproduct[i] = new Product(id, cname, series, price);

					}
					MobileController.addProductcontroler(addproduct);

					break;

				}
				case 2: {

					Product[] allproducts = MobileController.getAllMobilesController();
					for (Product product : allproducts) {
						System.out.println(product);
					}

					break;
				}

				case 3: {
					// int oldid = 0;

					// Product[] up = new Product[10];

					System.out.println("Enter id which you want to update");
					int oldid = sc.nextInt();

					MobileController.updateMobilesController(oldid);

					break;

				}

				case 4: {
					System.out.println("case 4 for delete");

					System.out.println("Enter id which you want to delete");
					int delid = sc.nextInt();

					MobileController.deleteMobilesController(delid);

					break;
				}
				case 5: {
					// System.out.println("case 5");

					break;
				}

				default: {
					System.out.println("Invelid Input");
					System.out.println();
				}

				}
				if (choice == 5) {
					break;

				}

			}

		}
	}


