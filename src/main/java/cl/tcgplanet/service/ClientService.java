package cl.tcgplanet.service;

import java.util.List;

import cl.tcgplanet.domain.Client;

public interface ClientService {
    public Client getClient(Client client);
    
    public List<Client> getAllClients();

    public void insertClient(Client client);

    public void updateClient(Client client);
    
    public void deleteClient(Client client);
}
