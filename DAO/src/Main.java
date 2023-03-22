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
		productDao.delete(1);
		productDao.create(new Product("789", "Cakewalk", 499));
		
		userDao.create(new User("001", "Alex"));
		userDao.create(new User("002", "Ben"));
		userDao.create(new User("003", "Carl"));
		userDao.update(2, new User("003", "Charlie"));
		
		for (Product element : productDao.getAll()) {
		    System.out.println(element);
		}
		for (User element : userDao.getAll()) {
		    System.out.println(element);
		}
		
	}
	
}
