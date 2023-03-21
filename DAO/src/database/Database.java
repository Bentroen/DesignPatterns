package database;

import java.util.ArrayList;

import model.Product;
import model.User;

public class Database {
	
	// Singleton pattern
	
	public static Database instance;
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}
	
	// Data storage
	
	ArrayList<User> users = new ArrayList<>();
	ArrayList<Product> products = new ArrayList<>();
	
	public ArrayList<Product> getProducts() {
		return products;
	}
	
	public ArrayList<User> getUsers() {
		return users;
	}
	
}
