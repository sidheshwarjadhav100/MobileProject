package com.sid.client;

import java.util.Scanner;
import com.sid.controller.MobileController;
import com.sid.dao.MobileDao;
import com.sid.entity.Product;

public class ShreeSaiMobileClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product[] addproduct = null;
		int exitCount = 0;
		while (true) {

			System.out.println("---------------------------");
			System.out.println("            Menu           ");
			System.out.println("---------------------------");

			System.out.println("1. Add Product into Data Base");
			System.out.println("2. Display Product from Data Base");
			System.out.println("3. Update Product into Data Base");
			System.out.println("4. Delete Product from Data Base");

			if (exitCount > 0) {
				System.out.println("5. Exit");

			}
			exitCount++;

			System.out.println();
			int choice = 0;

			try {
				System.out.println("Enter Choice");
				choice = sc.nextInt();

			} catch (Exception e) {
				System.out.println("Execution terminated due to invalid input...");
				break;
			}
			switch (choice) {

			// Add Product
			case 1: {
				int capacity = 0;
				try {
					System.out.println("Enter How Many Table do You Want To Add");
					try {
						capacity = sc.nextInt();
						new MobileDao(capacity);// pass constructor
					} catch (Exception e) {
						System.out.println("Execution terminated due to invalid input...");
						break;
					}

					addproduct = new Product[capacity];
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
				} catch (Exception e) {
					System.out.println("Execution terminated due to invalid input...");
					break;
				}
				String ack = MobileController.addProductcontroler(addproduct);
				System.out.println(ack);
				break;

			}
			// Display Product
			case 2: {

				Product[] allproducts = MobileController.getAllMobilesController();
				for (Product product : allproducts) {
					System.out.println(product);
				}

				break;
			}

			// Update Product
			case 3: {
				try {
					System.out.println("Enter id which you want to update");
					int oldid = sc.nextInt();
					String res = MobileController.updateMobilesController(oldid);
					System.out.println(res);
					break;

				} catch (Exception e) {
					System.out.println("Execution terminated due to invalid input...");
					break;
				}

			}

			// Delete Product
			case 4: {
				try {
					System.out.println("Enter id which you want to delete");
					int delid = sc.nextInt();
					String ack = MobileController.deleteMobilesController(delid);
					System.out.println(ack);

				} catch (Exception e) {
					System.out.println("Execution terminated due to invalid input...");
					break;

				}

				break;
			}
			case 5: {

				break;
			}

			default: {
				System.out.println("Invelid Input");
				System.out.println();
			}

			}

			if (choice == 5) {
				System.out.println("Thank You....!");
				break;

			}

		}

	}
}
