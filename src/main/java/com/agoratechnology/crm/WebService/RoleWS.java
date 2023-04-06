package com.agoratechnology.crm.WebService;

import com.agoratechnology.crm.Beans.Role;
import com.agoratechnology.crm.Services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/Role")
public class RoleWS {

    @Autowired
    RoleService roleService;

    @PostMapping
    public Boolean create(@RequestBody Role role) {
        return roleService.create(role);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Role role) {
        return roleService.update(role);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return roleService.delete(id);
    }

    @GetMapping("/all")
    public List<Role> findAll(){
        return roleService.findAll();
    }
}
