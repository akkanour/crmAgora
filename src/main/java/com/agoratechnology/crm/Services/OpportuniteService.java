package com.agoratechnology.crm.Services;

import com.agoratechnology.crm.Beans.Opportinute;
import com.agoratechnology.crm.Dao.OpportuniteDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class OpportuniteService {
    private final OpportuniteDao opportuniteDao;
    @Autowired
    public OpportuniteService(OpportuniteDao opportuniteDao){this.opportuniteDao = opportuniteDao;}

    public Boolean create(Opportinute opportunite) {

        Boolean test = false;

        if (opportuniteDao.save(opportunite) != null) {
            test = true;
        }

        return test;
    }

    public Boolean update(Opportinute opportunite) {

        Boolean test = false;

        if (this.findById(opportunite.getId()) != null) {
            opportuniteDao.save(opportunite);
            test = true;
        }

        return test;
    }

    public Boolean delete(Long id) {

        Boolean test = false;

        if (this.findById(id) != null) {
            opportuniteDao.deleteById(id);
            test = true;
        }

        return test;
    }

    public Opportinute findById(Long id) {
        return opportuniteDao.getById(id);
    }

    public List<Opportinute> findAll() {
        return opportuniteDao.findAll();
    }
}
