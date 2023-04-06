package com.agoratechnology.crm.Services;

import com.agoratechnology.crm.Beans.Intervention;
import com.agoratechnology.crm.Dao.InterventionDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class InterventionService {
    private final InterventionDao interventionDao;
    @Autowired
    public InterventionService(InterventionDao interventionDao){this.interventionDao = interventionDao;}

    public Boolean create(Intervention intervention) {

        Boolean test = false;

        if (interventionDao.save(intervention) != null) {
            test = true;
        }

        return test;
    }

    public Boolean update(Intervention intervention) {

        Boolean test = false;

        if (this.findById(intervention.getId()) != null) {
            interventionDao.save(intervention);
            test = true;
        }

        return test;
    }

    public Boolean delete(Long id) {

        Boolean test = false;

        if (this.findById(id) != null) {
            interventionDao.deleteById(id);
            test = true;
        }

        return test;
    }

    public Intervention findById(Long id) {
        return interventionDao.getById(id);
    }

    public List<Intervention> findAll() {
        return interventionDao.findAll();
    }
}
