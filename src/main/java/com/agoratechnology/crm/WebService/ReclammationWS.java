package com.agoratechnology.crm.WebService;

import com.agoratechnology.crm.Beans.Reclamation;
import com.agoratechnology.crm.Services.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/Reclamation")
public class ReclammationWS {
    @Autowired
    ReclamationService reclamationService;

    @PostMapping
    public Boolean create(@RequestBody Reclamation reclamation) {
        return reclamationService.create(reclamation);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Reclamation reclamation) {
        return reclamationService.update(reclamation);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return reclamationService.delete(id);
    }

    @GetMapping
    public List<Reclamation> findAll(){
        return reclamationService.findAll();
    }
}
