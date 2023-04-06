package com.agoratechnology.crm.Services;

import com.agoratechnology.crm.Beans.Departement;
import com.agoratechnology.crm.Dao.DepartementDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class DepartementService {
    private final DepartementDao departementDao;
    @Autowired
    public DepartementService(DepartementDao departementDao){this.departementDao = departementDao;}

    public Boolean create(Departement departement) {

        Boolean test = false;

        if (departementDao.save(departement) != null) {
            test = true;
        }

        return test;
    }

    public Boolean update(Departement departement) {

        Boolean test = false;

        if (this.findById(departement.getId()) != null) {
            departementDao.save(departement);
            test = true;
        }

        return test;
    }

    public Boolean delete(Long id) {

        Boolean test = false;

        if (this.findById(id) != null) {
            departementDao.deleteById(id);
            test = true;
        }

        return test;
    }

    public Departement findById(Long id) {
        return departementDao.getById(id);
    }

    public List<Departement> findAll() {
        return departementDao.findAll();
    }
}
