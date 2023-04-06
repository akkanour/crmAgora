package com.agoratechnology.crm.Services;

import com.agoratechnology.crm.Beans.Service;
import com.agoratechnology.crm.Dao.ServiceDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
@Transactional
public class ServiceService {

    private final ServiceDao serviceDao;
    @Autowired
    public ServiceService(ServiceDao serviceDao){this.serviceDao =serviceDao;}

    public Boolean create(Service service) {

        Boolean test = false;

        if (serviceDao.save(service) != null) {
            test = true;
        }

        return test;
    }

    public Boolean update(Service service) {

        Boolean test = false;

        if (this.findById(service.getId()) != null) {
            serviceDao.save(service);
            test = true;
        }

        return test;
    }

    public Boolean delete(Long id) {

        Boolean test = false;

        if (this.findById(id) != null) {
            serviceDao.deleteById(id);
            test = true;
        }

        return test;
    }

    public Service findById(Long id) {
        return serviceDao.getById(id);
    }

    public List<Service> findAll() {
        return serviceDao.findAll();
    }
}
