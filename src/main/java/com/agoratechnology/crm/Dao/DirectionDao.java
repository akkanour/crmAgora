package com.agoratechnology.crm.Dao;

import com.agoratechnology.crm.Beans.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectionDao extends JpaRepository<Direction, Long> {
}
