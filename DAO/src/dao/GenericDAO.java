package dao;

import java.util.ArrayList;

public interface GenericDAO<T> {
	
	public void create(T object);
	
	public T get(int index);
	
	public ArrayList<T> getAll();
	
	public void update(int index, T object);
	
	public void delete(int index);
	
}
