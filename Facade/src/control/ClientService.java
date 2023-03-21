package control;

import java.util.List;

import model.Client;
import model.ModelFacade;

public class ClientService {

	public static List<Client> listAllClients() {
		return ModelFacade.listAllClients();
	}
	
}
