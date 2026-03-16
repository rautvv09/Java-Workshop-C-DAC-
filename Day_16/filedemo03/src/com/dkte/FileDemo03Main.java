package com.dkte;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileDemo03Main {
	public static void main1(String[] args) {
		Product p = new Product(1, "iPhone16", 89000.0);
		String path = "D:/Nilesh/product1.bin";
		try(FileOutputStream fout = new FileOutputStream(path)) {
			try(DataOutputStream dout = new DataOutputStream(fout)) {
				dout.writeInt(p.getId());
				dout.writeUTF(p.getName());
				dout.writeDouble(p.getPrice());
				System.out.println("File Saved.");
			} // dout.close();
		} // fout.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main2(String[] args) {
		String path = "D:/Nilesh/product1.bin";
		try(FileInputStream fin = new FileInputStream(path)) {
			try(DataInputStream din = new DataInputStream(fin)) {
				int id = din.readInt();
				String name = din.readUTF();
				double price = din.readDouble();
				Product p = new Product(id, name, price);
				System.out.println("File Read: " + p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main3(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "Prod1", 100.0));
		list.add(new Product(2, "Prod2", 200.0));
		list.add(new Product(3, "Prod3", 300.0));
		
		String path = "D:/Nilesh/product2.bin";
		try(FileOutputStream fout = new FileOutputStream(path)) {
			try(DataOutputStream dout = new DataOutputStream(fout)) {
				for (Product p : list) {
					dout.writeInt(p.getId());
					dout.writeUTF(p.getName());
					dout.writeDouble(p.getPrice());					
				}
				System.out.println("File Saved.");
			} // dout.close();
		} // fout.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		String path = "D:/Nilesh/product2.bin";
		try(FileInputStream fin = new FileInputStream(path)) {
			try(DataInputStream din = new DataInputStream(fin)) {
				while(true) {
					int id = din.readInt();
					String name = din.readUTF();
					double price = din.readDouble();
					Product p = new Product(id, name, price);
					list.add(p);
					System.out.println("File Read: " + p);
				}
			}
		}
		catch (EOFException e) {
			System.out.println("All Records Read: " + list.size());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
