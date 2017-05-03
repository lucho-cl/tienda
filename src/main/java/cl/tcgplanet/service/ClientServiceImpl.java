package cl.tcgplanet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.tcgplanet.domain.Client;
import cl.tcgplanet.persistence.ClientMapper;

public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientMapper clientMapper;
	
	public Client getClient(Client client) {
		return clientMapper.getClient(client);
	}

	public List<Client> getAllClients() {
		return clientMapper.getAllClients();
	}

	public void insertClient(Client client) {
		clientMapper.insertClient(client);
	}

	public void updateClient(Client client) {
		clientMapper.updateClient(client);
	}

	public void deleteClient(Client client) {
		clientMapper.deleteClient(client);
	}

}
