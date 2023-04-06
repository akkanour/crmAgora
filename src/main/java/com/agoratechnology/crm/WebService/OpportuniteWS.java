package com.agoratechnology.crm.WebService;

import com.agoratechnology.crm.Beans.Opportinute;
import com.agoratechnology.crm.Services.OpportuniteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/Opportunite")
public class OpportuniteWS {
    @Autowired
    OpportuniteService opportuniteService;

    @PostMapping
    public Boolean create(@RequestBody Opportinute opportinute) {
        return opportuniteService.create(opportinute);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Opportinute opportinute) {
        return opportuniteService.update(opportinute);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return opportuniteService.delete(id);
    }

    @GetMapping
    public List<Opportinute> findAll(){
        return opportuniteService.findAll();
    }
}
