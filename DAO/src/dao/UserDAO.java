package dao;

import java.util.ArrayList;

import database.Database;
import model.User;

public class UserDAO implements GenericDAO<User> {

	public static Database db = Database.getInstance();

	@Override
	public void create(User object) {
		ArrayList<User> arr = db.getUsers();
		arr.add(object);
	}

	@Override
	public User get(int index) {
		ArrayList<User> arr = db.getUsers();
		return arr.get(index);
	}
	
	public ArrayList<User> getAll() {
		return db.getUsers();
	}

	@Override
	public void update(int index, User object) {
		ArrayList<User> arr = db.getUsers();
		arr.remove(index);
		arr.add(object);
	}

	@Override
	public void delete(int index) {
		ArrayList<User> arr = db.getUsers();
		arr.remove(index);
	}
	
}
