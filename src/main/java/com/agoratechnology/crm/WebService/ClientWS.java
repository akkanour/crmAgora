package com.agoratechnology.crm.WebService;

import com.agoratechnology.crm.Beans.Client;
import com.agoratechnology.crm.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/Client")
public class ClientWS {
    @Autowired
    ClientService clientService;

    @PostMapping
    public Boolean create(@RequestBody Client client) {
        return clientService.create(client);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Client client) {
        return clientService.update(client);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return clientService.delete(id);
    }

    @GetMapping("/all")
    public List<Client> findAll(){
        return clientService.findAll();
    }
}
