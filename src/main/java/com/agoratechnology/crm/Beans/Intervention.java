package com.agoratechnology.crm.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Entity
@Data
public class Intervention implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String duree_intervention;
    private Date date_debut_intervention;
    private Date date_fin_intervention;
    private String objet_intervention;
    private String resume_intervention;
    private String priorite_intervention;
    private String status_intervention;

}
