package com.agoratechnology.crm.WebService;

import com.agoratechnology.crm.Beans.Fonction;
import com.agoratechnology.crm.Services.FonctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/Fonction")
public class FonctionWS {
    @Autowired
    FonctionService fonctionService;

    @PostMapping
    public Boolean create(@RequestBody Fonction fonction) {
        return fonctionService.create(fonction);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Fonction fonction) {
        return fonctionService.update(fonction);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return fonctionService.delete(id);
    }

    @GetMapping("/all")
    public List<Fonction> findAll(){
        return fonctionService.findAll();
    }
}
