package com.agoratechnology.crm.Services;
import com.agoratechnology.crm.Beans.Role;
import com.agoratechnology.crm.Dao.RoleDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Transactional
@Service
public class RoleService {
    private final RoleDao roleDao;
    @Autowired
    public RoleService(RoleDao roleDao){this.roleDao = roleDao;}

    public Boolean create(Role role) {

        Boolean test = false;

        if (roleDao.save(role) != null) {
            test = true;
        }

        return test;
    }

    public Boolean update(Role role) {

        Boolean test = false;

        if (this.findById(role.getId()) != null) {
            roleDao.save(role);
            test = true;
        }

        return test;
    }

    public Boolean delete(Long id) {

        Boolean test = false;

        if (this.findById(id) != null) {
            roleDao.deleteById(id);
            test = true;
        }

        return test;
    }

    public Role findById(Long id) {
        return roleDao.getById(id);
    }

    public List<Role> findAll() {
        return roleDao.findAll();
    }
}
