package com.agoratechnology.crm.WebService;

import com.agoratechnology.crm.Beans.Utilisateur;
import com.agoratechnology.crm.Services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/Utilisateur")
public class UtilisateurWS {

    @Autowired
    UtilisateurService utilisateurService;

    @PostMapping
    public Boolean create(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.create(utilisateur);
    }

    @PutMapping("/update")
    public Boolean update(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.update(utilisateur);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id) {
        return utilisateurService.delete(id);
    }

    @GetMapping("/all")
    public List<Utilisateur> findAll(){
        return utilisateurService.findAll();
    }
}
