package com.agoratechnology.crm.Dao;

import com.agoratechnology.crm.Beans.Planing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanningDao extends JpaRepository<Planing, Long> {
}
