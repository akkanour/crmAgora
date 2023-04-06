package com.agoratechnology.crm.Services;

import com.agoratechnology.crm.Beans.Planing;
import com.agoratechnology.crm.Dao.PlanningDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class PlanningService {
    private final PlanningDao planningDao;
    @Autowired
    public PlanningService(PlanningDao planningDao){this.planningDao = planningDao;}
    public Boolean create(Planing planing) {

        Boolean test = false;

        if (planningDao.save(planing) != null) {
            test = true;
        }

        return test;
    }

    public Boolean update(Planing planing) {

        Boolean test = false;

        if (this.findById(planing.getId()) != null) {
            planningDao.save(planing);
            test = true;
        }

        return test;
    }

    public Boolean delete(Long id) {

        Boolean test = false;

        if (this.findById(id) != null) {
            planningDao.deleteById(id);
            test = true;
        }

        return test;
    }

    public Planing findById(Long id) {
        return planningDao.getById(id);
    }

    public List<Planing> findAll() {
        return planningDao.findAll();
    }
}
