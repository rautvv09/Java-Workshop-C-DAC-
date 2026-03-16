package com.dkte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileDemo04Main {
	public static void main1(String[] args) {
		Product p = new Product(1, "iPhone", 89000.0);
		String path = "D:/Nilesh/file4.bin";
		try(FileOutputStream fout = new FileOutputStream(path)) {
			try(ObjectOutputStream oout = new ObjectOutputStream(fout)) {
				oout.writeObject(p); // serialization
				System.out.println("File Saved.");
			} // oout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main2(String[] args) {
		String path = "D:/Nilesh/file4.bin";
		try(FileInputStream fin = new FileInputStream(path)) {
			try(ObjectInputStream oin = new ObjectInputStream(fin)) {
				Product p = (Product) oin.readObject(); // de-serialization
				System.out.println("File Read: " + p);
			} // oin.close();
		} // fin.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main3(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "Prod1", 100.0));
		list.add(new Product(2, "Prod2", 200.0));
		list.add(new Product(3, "Prod3", 300.0));
		String path = "D:/Nilesh/file5.bin";
		try(FileOutputStream fout = new FileOutputStream(path)) {
			try(ObjectOutputStream oout = new ObjectOutputStream(fout)) {
				oout.writeObject(list); // serialization
				System.out.println("File Saved.");
			} // oout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String path = "D:/Nilesh/file5.bin";
		try(FileInputStream fin = new FileInputStream(path)) {
			try(ObjectInputStream oin = new ObjectInputStream(fin)) {
				List<Product> list = (List<Product>) oin.readObject(); // de-serialization
				for(Product p : list)
					System.out.println("File Read: " + p);
			} // oin.close();
		} // fin.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
