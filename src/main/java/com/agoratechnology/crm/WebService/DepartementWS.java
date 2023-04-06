package com.agoratechnology.crm.WebService;

import com.agoratechnology.crm.Beans.Departement;
import com.agoratechnology.crm.Services.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/Departement")
public class DepartementWS {
    @Autowired
    DepartementService departementService;

    @PostMapping("/add")
    public Boolean create(@RequestBody Departement departement) {
        return departementService.create(departement);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Departement departement) {
        return departementService.update(departement);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return departementService.delete(id);
    }

    @GetMapping("/all")
    public List<Departement> findAll(){
        return departementService.findAll();
    }
}
