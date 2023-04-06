package com.agoratechnology.crm.Services;

import com.agoratechnology.crm.Beans.Fonction;
import com.agoratechnology.crm.Dao.FonctionDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class FonctionService {
    private final FonctionDao fonctionDao;
    @Autowired
    public FonctionService(FonctionDao fonctionDao){this.fonctionDao = fonctionDao;}

    public Boolean create(Fonction fonction) {

        Boolean test = false;

        if (fonctionDao.save(fonction) != null) {
            test = true;
        }

        return test;
    }

    public Boolean update(Fonction fonction) {

        Boolean test = false;

        if (this.findById(fonction.getId()) != null) {
            fonctionDao.save(fonction);
            test = true;
        }

        return test;
    }

    public Boolean delete(Long id) {

        Boolean test = false;

        if (this.findById(id) != null) {
            fonctionDao.deleteById(id);
            test = true;
        }

        return test;
    }

    public Fonction findById(Long id) {
        return fonctionDao.getById(id);
    }

    public List<Fonction> findAll() {
        return fonctionDao.findAll();
    }
}
