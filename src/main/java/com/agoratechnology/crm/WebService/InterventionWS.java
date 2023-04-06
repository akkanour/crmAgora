package com.agoratechnology.crm.WebService;

import com.agoratechnology.crm.Beans.Intervention;
import com.agoratechnology.crm.Services.InterventionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/Intervention")
public class InterventionWS {
    @Autowired
    InterventionService interventionService;

    @PostMapping
    public Boolean create(@RequestBody Intervention intervention) {
        return interventionService.create(intervention);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Intervention intervention) {
        return interventionService.update(intervention);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return interventionService.delete(id);
    }

    @GetMapping("/all")
    public List<Intervention> findAll(){
        return interventionService.findAll();
    }
}
