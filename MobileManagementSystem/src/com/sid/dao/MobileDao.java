package com.sid.dao;

import java.util.Scanner;

import com.sid.entity.Product;

public class MobileDao {

	private static int capacity; // size of an array
	private static int size = 0;

	public MobileDao() {
		super();
	}

	public MobileDao(int capacity) {
		this.capacity = capacity;
		arr = new Product[capacity];

	}

	public static Product arr[] = new Product[capacity];// static array declared

	public static Product[] addProductDao(Product[] add) {

		for (Product product : add) {
			if (size < capacity) {

				arr[size++] = product;// save one by one product value in arry[].
			} else {
				System.out.println("Array  size full");
			}
		}

		System.out.println("Added Successfully");

		return add;

	}

	public static Product[] getAllProductDao() {

		System.out.println("mobile dao method");

		return arr;

	}

	public static String updateProductDao(int oldid) {

		Scanner sc = new Scanner(System.in);
		String messagesuc = "Data Updated Successfully";
		
		for (int i = 0; i < size; i++) {

			if (arr[i].getId() == oldid) {

				System.out.println("Enter Updated id");
				int uid = sc.nextInt();
				System.out.println("Enter Updated company Name");
				String cname = sc.next();
				System.out.println("Enter Updated Series");
				String series = sc.next();
				System.out.println("Enter Updated Price");
				int price = sc.nextInt();

				arr[i].setId(uid);
				arr[i].setBrand(cname);
				arr[i].setSeries(series);
				arr[i].setPrice(price);
			}

		}
		return messagesuc;

	}

	public static Product[] deleteProductDao(int delid) {
		System.out.println("this is deleteProductDao ");

		for (int i = 0; i < size; i++) {
			if (arr[i].getId() == delid) {

				arr[i] = arr[size - 1];
				arr[size - 1] = null;
				size--;
				// arr[size--] = product;// delete array size value in arry[].

			} else {
				System.out.println("envalid id");

			}
		}

		return null;
	}

}
