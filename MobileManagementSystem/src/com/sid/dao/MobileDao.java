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

	public static String addProductDao(Product[] add) {
		String msg="Data Added Successfully";
	String	msgfail="Something Went Wrong";
		int count=0;
		for (Product product : add) {
			if (size < capacity) {
				
				arr[size++] = product;// save one by one product value in array[].
				count++;
			} else {
				System.out.println("Array  size full");
			}
		}if (count ==0) {
			return msgfail;
		} else {
			return msg;

		}

		

	}

	public static Product[] getAllProductDao() {

		System.out.println("mobile dao method");

		return arr;

	}

	public static String updateProductDao(int oldid) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		String messagesuc = "Data Updated Successfully";
		String messagefail = "Id is not present";

		for (int i = 0; i < size; i++) {

			if (arr[i].getId() == oldid) {
				count++;

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
		if (count == 0) {
			return messagefail;

		} else {
			return messagesuc;
		}
	}

	public static String deleteProductDao(int delid) {
		String msgsuc="Product Deleted Successfully.";
		String msgfail="Invalid Id";
		int count=0;
		

		for (int i = 0; i < size; i++) {
			if (arr[i].getId() == delid) {
				count++;
				arr[i] = arr[size - 1];
				arr[size - 1] = null;
				size--;

			}
		}if (count==0) {
			return msgfail;
			
		}else {
			return msgsuc;

		}

	}		

}
