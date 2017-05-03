package cl.tcgplanet.persistence;

import java.util.List;

import cl.tcgplanet.domain.Client;

public interface ClientMapper {

    public Client getClient(Client client);
    
    public List<Client> getAllClients();

    public void insertClient(Client client);

    public void updateClient(Client client);
    
    public void deleteClient(Client client);
}
