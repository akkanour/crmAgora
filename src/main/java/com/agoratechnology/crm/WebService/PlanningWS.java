package com.agoratechnology.crm.WebService;

import com.agoratechnology.crm.Beans.Planing;
import com.agoratechnology.crm.Services.PlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/Planning")
public class PlanningWS {
    @Autowired
    PlanningService planningService;

    @PostMapping
    public Boolean create(@RequestBody Planing planing) {
        return planningService.create(planing);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Planing planing) {
        return planningService.update(planing);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return planningService.delete(id);
    }

    @GetMapping
    public List<Planing> findAll(){
        return planningService.findAll();
    }
}
