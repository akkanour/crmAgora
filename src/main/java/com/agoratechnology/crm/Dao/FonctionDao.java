package com.agoratechnology.crm.Dao;

import com.agoratechnology.crm.Beans.Fonction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FonctionDao extends JpaRepository<Fonction, Long> {
}
