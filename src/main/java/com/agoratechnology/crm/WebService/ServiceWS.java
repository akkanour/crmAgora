package com.agoratechnology.crm.WebService;

import com.agoratechnology.crm.Beans.Service;
import com.agoratechnology.crm.Services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/Service")
public class ServiceWS {

    @Autowired
    ServiceService serviceService;

    @PostMapping
    public Boolean create(@RequestBody Service service) {
        return serviceService.create(service);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Service service) {
        return serviceService.update(service);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return serviceService.delete(id);
    }

    @GetMapping("/all")
    public List<Service> findAll(){
        return serviceService.findAll();
    }

}
