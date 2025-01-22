package LibraryProject.services;

import LibraryProject.models.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private List<Client> clientList = new ArrayList<>();

    public void registerClient(Client client) {
        if(client != null) {
            clientList.add(client);
        }else{
            System.out.println(" ");
        }
    }

}
