package com.agoratechnology.crm.Services;

import com.agoratechnology.crm.Beans.Client;
import com.agoratechnology.crm.Dao.ClientDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ClientService {
    private final ClientDao clientDao;
    @Autowired
    public ClientService(ClientDao clientDao){this.clientDao =clientDao;}

    public Boolean create(Client client) {

        Boolean test = false;

        if (clientDao.save(client) != null) {
            test = true;
        }

        return test;
    }

    public Boolean update(Client client) {

        Boolean test = false;

        if (this.findById(client.getId()) != null) {
            clientDao.save(client);
            test = true;
        }

        return test;
    }

    public Boolean delete(Long id) {

        Boolean test = false;

        if (this.findById(id) != null) {
            clientDao.deleteById(id);
            test = true;
        }

        return test;
    }

    public Client findById(Long id) {
        return clientDao.getById(id);
    }

    public List<Client> findAll() {
        return clientDao.findAll();
    }
}
