package com.agoratechnology.crm.Dao;

import com.agoratechnology.crm.Beans.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceDao extends JpaRepository<Service, Long> {
}
