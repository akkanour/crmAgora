package com.agoratechnology.crm.WebService;

import com.agoratechnology.crm.Beans.Direction;
import com.agoratechnology.crm.Services.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/Direction")
public class DirectionWS {

    @Autowired
    DirectionService directionService;

    @PostMapping
    public Boolean create(@RequestBody Direction direction) {
        return directionService.create(direction);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Direction direction) {
        return directionService.update(direction);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return directionService.delete(id);
    }

    @GetMapping("/all")
    public List<Direction> findAll(){
        return directionService.findAll();
    }
}
