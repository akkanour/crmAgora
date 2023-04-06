package com.agoratechnology.crm.Services;

import com.agoratechnology.crm.Beans.Reclamation;
import com.agoratechnology.crm.Dao.ReclamationDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class ReclamationService {
    private final ReclamationDao reclamationDao;
    @Autowired
    public ReclamationService(ReclamationDao reclamationDao){this.reclamationDao = reclamationDao;}
    public Boolean create(Reclamation reclamation) {

        Boolean test = false;

        if (reclamationDao.save(reclamation) != null) {
            test = true;
        }

        return test;
    }

    public Boolean update(Reclamation reclamation) {

        Boolean test = false;

        if (this.findById(reclamation.getId()) != null) {
            reclamationDao.save(reclamation);
            test = true;
        }

        return test;
    }

    public Boolean delete(Long id) {

        Boolean test = false;

        if (this.findById(id) != null) {
            reclamationDao.deleteById(id);
            test = true;
        }

        return test;
    }

    public Reclamation findById(Long id) {
        return reclamationDao.getById(id);
    }

    public List<Reclamation> findAll() {
        return reclamationDao.findAll();
    }
}
