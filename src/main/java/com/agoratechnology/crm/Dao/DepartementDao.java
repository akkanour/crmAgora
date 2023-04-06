package com.agoratechnology.crm.Dao;

import com.agoratechnology.crm.Beans.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementDao extends JpaRepository<Departement, Long> {
}
