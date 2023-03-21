import java.util.Arrays;

import dao.ProductDAO;
import dao.UserDAO;
import model.Product;
import model.User;

public class Main {

	public static void main(String[] args) {
		
		ProductDAO productDao = new ProductDAO();
		UserDAO userDao = new UserDAO();
		
		productDao.create(new Product("123", "Ableton", 799));
		productDao.create(new Product("456", "GarageBand", 199));
		productDao.create(new Product("789", "Cakewalk", 499));
		
		userDao.create(new User("001", "Alex"));
		userDao.create(new User("002", "Ben"));
		userDao.create(new User("003", "Carl"));
		
		System.out.println(Arrays.toString(productDao.getAll()));
		System.out.println(Arrays.toString(userDao.getAll()));
		
	}
	
	
}
