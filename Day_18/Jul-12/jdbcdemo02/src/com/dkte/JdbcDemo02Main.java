package com.dkte;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Scanner;

/*
Write a Menu driven program for E-commerce application. Provide following functionalities.
1. Sign Up
2. Sign In
3. Sign Out
4. Admin - Add Product
5. Admin - Delete Product
6. Admin - Update Product
7. Admin - Change Order Status
8. Customer - Display All Products
9. Customer - Find Product
10. Customer - Place Order
*/

public class JdbcDemo02Main {
	private static Scanner sc = new Scanner(System.in);
	// private static int curUserId = 0;
	private static User curUser = null;
	
	public static void signUp() {
		System.out.println("User Registration");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Passwd: ");
		String passwd = sc.next();
		System.out.print("Addr: ");
		String addr = sc.next();

		try(Connection con = DbUtil.getConnection()) {
			String sql = "INSERT INTO users(id, name, email, passwd, addr) VALUES (default, ?, ?, ?, ?)";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, name);
				stmt.setString(2, email);
				stmt.setString(3, passwd);
				stmt.setString(4, addr);
				int count = stmt.executeUpdate();
				System.out.println("User Registered: " + count);
			} 
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void signIn() {
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Passwd: ");
		String passwd = sc.next();
		try(Connection con = DbUtil.getConnection()) {
			String sql = "SELECT * FROM users WHERE email=? AND passwd=?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, email);
				stmt.setString(2, passwd);
				try(ResultSet rs = stmt.executeQuery()) {
					if(rs.next()) {
						int id = rs.getInt("id");
						String addr = rs.getString("addr");
						String name = rs.getString("name");
						curUser = new User(id, name, email, passwd, addr);
						System.out.println("Login Successful.");
					}
					else {
						System.out.println("Login Failed.");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void signOut() {
		curUser = null;
	}
	public static void addProduct() {
		if(curUser == null) {
			System.out.println("User is not Logged In.");
			return;
		}
		if(!curUser.getName().equals("Admin")) {
			System.out.println("You are not Admin.");
			return;
		}
		try(Connection con = DbUtil.getConnection()) {
			String sql = "INSERT INTO products VALUES (default, ?, ?)";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				System.out.print("Enter Product Name: ");
				String name = sc.next();
				System.out.print("Enter Product Price: ");
				double price= sc.nextDouble();
				stmt.setString(1, name);
				stmt.setDouble(2, price);
				int count = stmt.executeUpdate();
				System.out.println("Rows Inserted: " + count);
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void updateProduct() {
		if(curUser == null) {
			System.out.println("User is not Logged In.");
			return;
		}
		if(!curUser.getName().equals("Admin")) {
			System.out.println("You are not Admin.");
			return;
		}
		try(Connection con = DbUtil.getConnection()) {
			String sql = "UPDATE products SET name=?, price=? WHERE id=?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				System.out.print("Enter Product Id: ");
				int id = sc.nextInt();
				System.out.print("Enter Product New Name: ");
				String name = sc.next();
				System.out.print("Enter Product New Price: ");
				double price= sc.nextDouble();
				stmt.setString(1, name);
				stmt.setDouble(2, price);
				stmt.setInt(3, id);
				int count = stmt.executeUpdate();
				System.out.println("Rows Updated: " + count);
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}				
	}
	public static void deleteProduct() {
		if(curUser == null) {
			System.out.println("User is not Logged In.");
			return;
		}
		if(!curUser.getName().equals("Admin")) {
			System.out.println("You are not Admin.");
			return;
		}
		try(Connection con = DbUtil.getConnection()) {
			String sql = "DELETE FROM products WHERE id=?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				System.out.print("Enter Product Id: ");
				int id = sc.nextInt();
				stmt.setInt(1, id);
				int count = stmt.executeUpdate();
				System.out.println("Rows Deleted: " + count);
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static void changeOrderStatus() {
		
	}
	public static void displayAllProducts() {
		if(curUser == null) {
			System.out.println("User is not Logged In.");
			return;
		}
		try(Connection con = DbUtil.getConnection()) {
			String sql = "SELECT * FROM products";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						double price = rs.getDouble("price");
						System.out.println(id + ", " + name + ", " + price);
					}
				} // rs.close();
			} // stmt.close();
		} // con.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void findProductByName() {
		if(curUser == null) {
			System.out.println("User is not Logged In.");
			return;
		}
		try(Connection con = DbUtil.getConnection()) {
			String sql = "SELECT * FROM products WHERE name LIKE ?";
			System.out.print("Enter Product Name: ");
			String findName = sc.next();
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, "%"+findName+"%");
				try(ResultSet rs = stmt.executeQuery()) {
					boolean found = false;
					while(rs.next()) {
						found = true;
						int id = rs.getInt("id");
						String name = rs.getString("name");
						double price = rs.getDouble("price");
						System.out.println(id + ", " + name + ", " + price);
					}
					if(!found)
						System.out.println("Product Not Found");
				} // rs.close();
			} // stmt.close();
		} // con.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void findProductByPrice() {
		
	}
	public static void placeOrder() {
		if(curUser == null) {
			System.out.println("User is not Logged In.");
			return;
		}
		if(curUser.getName().equals("Admin")) {
			System.out.println("You are not Customer.");
			return;
		}
		
		System.out.print("Enter Product Id to Purchase: ");
		int prodId = sc.nextInt();
		try(Connection con = DbUtil.getConnection()) {
			String sql = "INSERT INTO orders VALUES(default, ?, ?, NOW(), 'Pending')";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setInt(1, curUser.getId());
				stmt.setInt(2, prodId);
				int count = stmt.executeUpdate();
				System.out.println("Orders Placed: " + count);
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void showCustomerOrders() {
		if(curUser == null) {
			System.out.println("User is not Logged In.");
			return;
		}
		if(curUser.getName().equals("Admin")) {
			System.out.println("You are not Customer.");
			return;
		}
		
		try(Connection con = DbUtil.getConnection()) {
			String sql = "SELECT p.id, p.name, p.price, o.order_dt, o.status FROM products p INNER JOIN orders o ON o.prod_id = p.id WHERE o.user_id=?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setInt(1, curUser.getId());
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						double price = rs.getDouble("price");
						Timestamp ordDate = rs.getTimestamp("order_dt");
						String status = rs.getString("status");
						System.out.println(id + ", " + name + ", " + price + ", " + ordDate + ", " + status);
					}
				} // rs.close();
			} // stmt.close();
		} // con.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// case 1:
		//signUp();
		// case 2:
		signIn();
		//case 3:
		//signOut();
		//case 4:
		//addProduct();
		//case 5:
		//deleteProduct();
		//case 6:
		//updateProduct();
		//case 7:
		//displayAllProducts();
		//case 8:
		//findProductByName();
		//case 8:
		//placeOrder();
		//case 9:
		showCustomerOrders();
	}
}
