package com.agoratechnology.crm.Dao;

import com.agoratechnology.crm.Beans.Opportinute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpportuniteDao extends JpaRepository<Opportinute, Long> {
}
