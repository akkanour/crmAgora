package com.agoratechnology.crm.Dao;

import com.agoratechnology.crm.Beans.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationDao extends JpaRepository<Reclamation, Long> {
}
