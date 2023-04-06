package com.agoratechnology.crm.Services;

import com.agoratechnology.crm.Beans.Direction;
import com.agoratechnology.crm.Dao.DirectionDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class DirectionService {
    private final DirectionDao directionDao;
    @Autowired
    public DirectionService(DirectionDao directionDao){this.directionDao = directionDao;}


    public Boolean create(Direction direction) {

        Boolean test = false;

        if (directionDao.save(direction) != null) {
            test = true;
        }

        return test;
    }

    public Boolean update(Direction direction) {

        Boolean test = false;

        if (this.findById(direction.getId()) != null) {
            directionDao.save(direction);
            test = true;
        }

        return test;
    }

    public Boolean delete(Long id) {

        Boolean test = false;

        if (this.findById(id) != null) {
            directionDao.deleteById(id);
            test = true;
        }

        return test;
    }

    public Direction findById(Long id) {
        return directionDao.getById(id);
    }

    public List<Direction> findAll() {
        return directionDao.findAll();
    }
}
