package com.agoratechnology.crm.Services;

import com.agoratechnology.crm.Beans.Utilisateur;
import com.agoratechnology.crm.Dao.UtilisateurDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class UtilisateurService {
    private final UtilisateurDao utilisateurDao;
    @Autowired
    public UtilisateurService(UtilisateurDao utilisateurDao){this.utilisateurDao = utilisateurDao;}

    public Boolean create(Utilisateur utilisateur) {

        Boolean test = false;

        if (utilisateurDao.save(utilisateur) != null) {
            test = true;
        }

        return test;
    }

    public Boolean update(Utilisateur utilisateur) {

        Boolean test = false;

        if (this.findById(utilisateur.getId()) != null) {
            utilisateurDao.save(utilisateur);
            test = true;
        }

        return test;
    }

    public Boolean delete(Long id) {

        Boolean test = false;

        if (this.findById(id) != null) {
            utilisateurDao.deleteById(id);
            test = true;
        }

        return test;
    }

    public Utilisateur findById(Long id) {
        return utilisateurDao.getById(id);
    }

    public List<Utilisateur> findAll() {
        return utilisateurDao.findAll();
    }
}
