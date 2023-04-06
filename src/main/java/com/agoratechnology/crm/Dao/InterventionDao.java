package com.agoratechnology.crm.Dao;

import com.agoratechnology.crm.Beans.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterventionDao extends JpaRepository<Intervention, Long> {
}
