package model;

import java.util.List;

public class ModelFacade {

	public static List<Client> listAllClients() {
		return DataBase.clients;
	}
	
}
