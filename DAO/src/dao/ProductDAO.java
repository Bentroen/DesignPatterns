package dao;

import java.util.ArrayList;

import database.Database;
import model.Product;

public class ProductDAO implements GenericDAO<Product> {

	public static Database db = Database.getInstance();

	@Override
	public void create(Product object) {
		ArrayList<Product> arr = db.getProducts();
		arr.add(object);
	}

	@Override
	public Product get(int index) {
		ArrayList<Product> arr = db.getProducts();
		return arr.get(index);
	}
	
	public ArrayList<Product> getAll() {
		return db.getProducts();
	}

	@Override
	public void update(int index, Product object) {
		ArrayList<Product> arr = db.getProducts();
		arr.remove(index);
		arr.add(object);
	}

	@Override
	public void delete(int index) {
		ArrayList<Product> arr = db.getProducts();
		arr.remove(index);
	}
	
}
